package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jgq implements ageo {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/navigation/ComposeRowNavigationListener");
    public final mdc b;

    public jgq(mdc mdcVar) {
        mdcVar.getClass();
        this.b = mdcVar;
    }

    @Override // defpackage.ageo
    public final void a(agek agekVar, int i, Duration duration) {
        amqh amqhVar;
        alvw f = a.f();
        f.X(alwp.a, "BugleComposeRow2");
        alvg alvgVar = (alvg) f.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/navigation/ComposeRowNavigationListener", "onScreenClosed", 96, "ComposeRowNavigationListener.kt");
        Integer valueOf = Integer.valueOf(i);
        alvgVar.J("ComposeRowNavigationListener.onScreenClosed %s, %s, %s", agekVar, valueOf, duration);
        switch (agekVar.ordinal()) {
            case 0:
                amqhVar = amqh.CAMERA_GALLERY;
                break;
            case 1:
                amqhVar = amqh.EMOJI;
                break;
            case 2:
                amqhVar = amqh.GIF;
                break;
            case 3:
            case 7:
                amqhVar = amqh.UNKNOWN_COMPOSE_SCREEN_CATEGORY;
                break;
            case 4:
                amqhVar = amqh.ALL;
                break;
            case 5:
                amqhVar = amqh.STICKER;
                break;
            case 6:
                amqhVar = amqh.VOICE;
                break;
            case 8:
                amqhVar = amqh.EMOTIFY;
                break;
            default:
                throw new armm();
        }
        this.b.c(amqhVar, amqi.COLLAPSED, amqd.UNKNOWN_CLOSING_SOURCE, valueOf, duration);
    }

    @Override // defpackage.ageo
    public final void b(agek agekVar, int i, Duration duration) {
        alvw f = a.f();
        f.X(alwp.a, "BugleComposeRow2");
        ((alvg) f.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/navigation/ComposeRowNavigationListener", "onScreenOpened", 80, "ComposeRowNavigationListener.kt")).J("ComposeRowNavigationListener.onScreenOpened %s, %s, %s", agekVar, Integer.valueOf(i), duration);
    }

    public final void c(jus jusVar) {
        amqh amqhVar;
        alvw f = a.f();
        f.X(alwp.a, "BugleComposeRow2");
        ((alvg) f.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/navigation/ComposeRowNavigationListener", "onShortcutSelected", 59, "ComposeRowNavigationListener.kt")).t("ComposeRowNavigationListener.onShortcutSelected %s", jusVar);
        if (d.F(jusVar, juj.a)) {
            amqhVar = amqh.CONTACT;
        } else if (d.F(jusVar, juk.a)) {
            amqhVar = amqh.FILE;
        } else if (d.F(jusVar, jul.a)) {
            amqhVar = amqh.CAMERA_GALLERY;
        } else if (d.F(jusVar, jum.a)) {
            amqhVar = amqh.EMOTIVE;
        } else if (d.F(jusVar, jun.a)) {
            amqhVar = amqh.LOCATION;
        } else if (d.F(jusVar, jur.a)) {
            amqhVar = amqh.EMOTIVE;
        } else if (d.F(jusVar, juq.a)) {
            amqhVar = amqh.SELFIE_GIF;
        } else if (d.F(jusVar, juo.a)) {
            amqhVar = amqh.UNKNOWN_COMPOSE_SCREEN_CATEGORY;
        } else if (d.F(jusVar, jup.a)) {
            amqhVar = null;
        } else {
            throw new armm();
        }
        amqh amqhVar2 = amqhVar;
        if (amqhVar2 == null) {
            return;
        }
        this.b.d(amqhVar2, amqi.EXPANDED, amqe.UNKNOWN_OPENING_SOURCE, amqf.UNKNOWN_OPENING_STATE, null, null);
    }
}
