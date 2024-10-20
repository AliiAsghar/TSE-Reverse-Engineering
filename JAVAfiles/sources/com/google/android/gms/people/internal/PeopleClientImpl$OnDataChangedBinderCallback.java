package com.google.android.gms.people.internal;

import android.os.Bundle;
import android.util.Log;
import defpackage.absy;
import defpackage.acfm;
import defpackage.acft;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class PeopleClientImpl$OnDataChangedBinderCallback extends AbstractPeopleCallbacks {
    private final absy a;

    public PeopleClientImpl$OnDataChangedBinderCallback(absy<acfm> absyVar) {
        this.a = absyVar;
    }

    @Override // com.google.android.gms.people.internal.AbstractPeopleCallbacks, com.google.android.gms.people.internal.IPeopleCallbacks
    public void onBundleLoaded(int i, Bundle bundle, Bundle bundle2) {
        if (i != 0) {
            if (Log.isLoggable("PeopleClient", 5)) {
                Log.w("PeopleClient", "Non-success data changed callback received.");
            }
        } else {
            absy absyVar = this.a;
            bundle2.getString("account");
            bundle2.getString("pagegaiaid");
            bundle2.getInt("scope");
            absyVar.b(new acft(2));
        }
    }

    public void release() {
        this.a.a();
    }
}
