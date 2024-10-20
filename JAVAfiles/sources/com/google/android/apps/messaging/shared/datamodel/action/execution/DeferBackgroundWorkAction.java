package com.google.android.apps.messaging.shared.datamodel.action.execution;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.amdy;
import defpackage.qxs;
import defpackage.rbw;
import defpackage.rgd;
import defpackage.rha;
import defpackage.rib;
import defpackage.rig;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class DeferBackgroundWorkAction extends Action<Void> {
    public static final Parcelable.Creator<Action<Void>> CREATOR = new rha(4);
    public final rib a;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        rig Na();
    }

    public DeferBackgroundWorkAction(rib ribVar, Parcel parcel) {
        super(parcel, amdy.DEFER_BACKGROUND_WORK_ACTION);
        this.a = ribVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("DeferBackgroundWorkAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        int i = 9;
        if (this.u.x("bundled_background_actions")) {
            ArrayList n = this.u.n("bundled_background_actions", Bundle.class);
            n.getClass();
            Collection.EL.stream(n).map(new rbw(this, 15)).forEach(new rgd(this, i));
            return null;
        }
        ArrayList n2 = this.u.n("background_actions", Action.class);
        n2.getClass();
        Collection.EL.stream(n2).forEach(new rgd(this, i));
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public DeferBackgroundWorkAction(rib ribVar, ArrayList arrayList) {
        super(amdy.DEFER_BACKGROUND_WORK_ACTION);
        this.a = ribVar;
        this.u.u("bundled_background_actions", (ArrayList) Collection.EL.stream(arrayList).map(new rbw(ribVar, 16)).collect(Collectors.toCollection(new qxs(14))));
    }
}
