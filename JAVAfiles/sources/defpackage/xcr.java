package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum xcr {
    SEND_BUTTON_LEGACY(new ahka("MessageSendingAnalytics::pressButton")),
    SEND_BUTTON_ACCURATE(new ahka("MLA::pressButton")),
    NOTIFICATION(new ahka("MLA::notification")),
    TACHYGRAM_FINISHED_SENDING(new ahka("MLA::tachygramFinishedSending")),
    TICKLE_ARRIVED(new ahka("MLA::tickle")),
    TACHYGRAM_MESSAGE_ARRIVED(new ahka("MLA::tachygramArrived"));

    final ahka g;

    xcr(ahka ahkaVar) {
        this.g = ahkaVar;
    }
}
