package com.google.android.apps.messaging.shared.datamodel.action;

import android.app.RemoteInput;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.alvi;
import defpackage.alwo;
import defpackage.amdy;
import defpackage.apct;
import defpackage.armf;
import defpackage.asgt;
import defpackage.atok;
import defpackage.mbl;
import defpackage.qoq;
import defpackage.ray;
import defpackage.riv;
import defpackage.rix;
import defpackage.rjb;
import defpackage.uac;
import defpackage.via;
import defpackage.vjs;
import defpackage.xnv;
import defpackage.xze;
import defpackage.yyb;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class NoConfirmationMessageSendAction extends Action<Void> implements Parcelable {
    private final armf A;
    private final armf B;
    private final armf C;
    public final armf a;
    private final via e;
    private final riv f;
    private final armf g;
    private final armf h;
    private final Context i;
    private final qoq j;
    private final armf k;
    private final mbl l;
    private final vjs m;
    private final rix n;
    private final armf o;
    private final armf p;
    private final xnv q;
    private final armf z;
    private static final alwo b = alwo.o("BugleNotifications");
    private static final xze c = xze.g("Bugle", "NoConfirmationMessageSendAction");
    private static final alvi d = alvi.m("com/google/android/apps/messaging/shared/datamodel/action/NoConfirmationMessageSendAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new ray(3);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        rjb cU();
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface b {
        riv cP();

        rix cQ();

        via eu();
    }

    public NoConfirmationMessageSendAction(Context context, armf armfVar, qoq qoqVar, armf armfVar2, mbl mblVar, armf armfVar3, armf armfVar4, vjs vjsVar, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, xnv xnvVar, armf armfVar10) {
        super(amdy.NO_CONFIRMATION_MESSAGE_SEND_ACTION);
        this.A = armfVar;
        b bVar = (b) yyb.aL(b.class);
        this.e = bVar.eu();
        this.f = bVar.cP();
        this.z = armfVar8;
        this.i = context;
        this.j = qoqVar;
        this.k = armfVar2;
        this.l = mblVar;
        this.g = armfVar3;
        this.h = armfVar4;
        this.m = vjsVar;
        this.a = armfVar5;
        this.o = armfVar6;
        this.p = armfVar7;
        this.q = xnvVar;
        this.n = bVar.cQ();
        this.B = armfVar9;
        this.C = armfVar10;
    }

    private static String h(Intent intent, String str) {
        Bundle resultsFromIntent;
        CharSequence charSequence;
        String stringExtra = intent.getStringExtra(str);
        if (stringExtra == null && (resultsFromIntent = RemoteInput.getResultsFromIntent(intent)) != null && (charSequence = resultsFromIntent.getCharSequence(str)) != null) {
            return charSequence.toString();
        }
        return stringExtra;
    }

    private final void j(atok atokVar, apct apctVar, asgt asgtVar) {
        ((uac) this.o.b()).w(atokVar, null, 10, 21, 44, Optional.of(asgtVar), apctVar);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("NoConfirmationMessageSendAction");
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0534 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03f2  */
    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ java.lang.Object b() {
        /*
            Method dump skipped, instructions count: 1470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.datamodel.action.NoConfirmationMessageSendAction.b():java.lang.Object");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.NoConfirmationMessageSend.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public NoConfirmationMessageSendAction(Context context, armf armfVar, qoq qoqVar, armf armfVar2, mbl mblVar, armf armfVar3, armf armfVar4, vjs vjsVar, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, xnv xnvVar, Parcel parcel) {
        super(parcel, amdy.NO_CONFIRMATION_MESSAGE_SEND_ACTION);
        this.A = armfVar;
        b bVar = (b) yyb.aL(b.class);
        this.e = bVar.eu();
        this.f = bVar.cP();
        this.z = armfVar8;
        this.i = context;
        this.j = qoqVar;
        this.k = armfVar2;
        this.l = mblVar;
        this.g = armfVar3;
        this.h = armfVar4;
        this.m = vjsVar;
        this.a = armfVar5;
        this.o = armfVar6;
        this.p = armfVar7;
        this.q = xnvVar;
        this.n = bVar.cQ();
        this.B = armfVar9;
        this.C = armfVar10;
    }
}
