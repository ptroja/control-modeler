package robmod.robmod.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import robmod.robmod.diagram.providers.RobmodElementTypes;

/**
 * @generated
 */
public class HandlerGeneratesItemSemanticEditPolicy extends
		RobmodBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public HandlerGeneratesItemSemanticEditPolicy() {
		super(RobmodElementTypes.HandlerGenerates_4008);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
