package defpackage;

import j$.util.Collection;
import j$.util.stream.Collectors;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qpe {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/conversation/match/ConversationDetailsLogger");
    public final armf b;
    public final armf c;

    public qpe(armf armfVar, armf armfVar2) {
        this.b = armfVar;
        this.c = armfVar2;
    }

    public static aomj a(alog alogVar, qqq qqqVar) {
        return new aomj(aomi.CONFIRMED_UPLOAD_SAFE_USER_DATA, Collection.EL.stream(alogVar).map(new qcr(qqqVar, 9)).collect(Collectors.joining(", ")));
    }
}
