package com.lnc.first;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class MyPhaseListener implements PhaseListener {

	private static final long serialVersionUID = 1L;

	public MyPhaseListener() {

	}

	public void beforePhase(PhaseEvent pe) {
		if (pe.getPhaseId() == PhaseId.RESTORE_VIEW)
			System.out.println("Processing new  Request!");

		System.out.println("before - " + pe.getPhaseId().toString());
	}

	public void afterPhase(PhaseEvent pe) {
		System.out.println("after - " + pe.getPhaseId().toString());

		if (pe.getPhaseId() == PhaseId.RENDER_RESPONSE)
			System.out.println("Done with Request!\n");
	}

	public PhaseId getPhaseId() {
		return PhaseId.ANY_PHASE;
	}
}
