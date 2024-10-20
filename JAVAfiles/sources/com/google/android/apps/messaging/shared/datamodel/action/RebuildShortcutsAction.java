package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.alwo;
import defpackage.amdy;
import defpackage.aneo;
import defpackage.qdm;
import defpackage.rdk;
import defpackage.rdl;
import defpackage.rrj;
import defpackage.xzu;
import j$.util.Optional;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class RebuildShortcutsAction extends ThrottledAction {
    public final rrj b;
    public final aneo c;
    public final aneo d;
    private final Optional f;
    public static final alwo a = alwo.o("BugleShortcuts");
    private static final long e = TimeUnit.SECONDS.toMillis(60);
    public static final Parcelable.Creator<ThrottledAction> CREATOR = new rdk(0);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        rdl NH();
    }

    public RebuildShortcutsAction(Context context, Optional<xzu> optional, rrj rrjVar, aneo aneoVar, aneo aneoVar2) {
        super(amdy.REBUILD_SHORTCUTS_ACTION);
        this.f = optional;
        this.b = rrjVar;
        this.c = aneoVar;
        this.d = aneoVar2;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction, com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("RebuildShortcutsAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.RebuildShortCuts.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final int f() {
        return 107;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final long g() {
        return e;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final String h() {
        return "RebuildShortcutsAction";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final void i() {
        this.f.ifPresent(new qdm(this, 20));
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public RebuildShortcutsAction(Context context, Optional<xzu> optional, rrj rrjVar, aneo aneoVar, aneo aneoVar2, Parcel parcel) {
        super(parcel, amdy.REBUILD_SHORTCUTS_ACTION);
        this.f = optional;
        this.b = rrjVar;
        this.c = aneoVar;
        this.d = aneoVar2;
    }
}
