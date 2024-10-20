package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum iit {
    REACTION_BADGE(0, iis.REACTIONS_GROUP),
    CUSTOM_REACTION_BADGE(1, iis.REACTIONS_GROUP),
    STAR_BADGE(2, iis.STAR_GROUP),
    CALENDAR_BADGE(3, iis.CALENDAR_GROUP),
    SCHEDULED_SEND_BADGE(4, iis.SCHEDULED_SEND_GROUP),
    REMINDER_BADGE(5, iis.REMINDER_GROUP);

    public final int g;
    public final iis h;

    iit(int i2, iis iisVar) {
        this.g = i2;
        this.h = iisVar;
    }
}
