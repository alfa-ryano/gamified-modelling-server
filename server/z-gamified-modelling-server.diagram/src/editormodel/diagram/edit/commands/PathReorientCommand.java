/*
 * 
 */
package editormodel.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import editormodel.Level;
import editormodel.Path;
import editormodel.diagram.edit.policies.EditormodelBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class PathReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

	/**
	* @generated
	*/
	private final EObject oldEnd;

	/**
	* @generated
	*/
	private final EObject newEnd;

	/**
	* @generated
	*/
	public PathReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Path) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof Level && newEnd instanceof Level)) {
			return false;
		}
		Level target = getLink().getNextLevel();
		if (!(getLink().eContainer() instanceof Level)) {
			return false;
		}
		Level container = (Level) getLink().eContainer();
		return EditormodelBaseItemSemanticEditPolicy.getLinkConstraints().canExistPath_4001(container, getLink(),
				getNewSource(), target);
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Level && newEnd instanceof Level)) {
			return false;
		}
		Level source = getLink().getPrevLevel();
		if (!(getLink().eContainer() instanceof Level)) {
			return false;
		}
		Level container = (Level) getLink().eContainer();
		return EditormodelBaseItemSemanticEditPolicy.getLinkConstraints().canExistPath_4001(container, getLink(),
				source, getNewTarget());
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	* @generated
	*/
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setPrevLevel(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setNextLevel(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected Path getLink() {
		return (Path) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected Level getOldSource() {
		return (Level) oldEnd;
	}

	/**
	* @generated
	*/
	protected Level getNewSource() {
		return (Level) newEnd;
	}

	/**
	* @generated
	*/
	protected Level getOldTarget() {
		return (Level) oldEnd;
	}

	/**
	* @generated
	*/
	protected Level getNewTarget() {
		return (Level) newEnd;
	}
}
