package com.google.android.apps.messaging.ui.mediapicker.c2o.customization;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;
import defpackage.aapv;
import defpackage.aoyj;
import defpackage.aozs;
import defpackage.aozy;
import defpackage.apag;
import defpackage.apax;
import defpackage.apdj;
import defpackage.apel;
import defpackage.apem;
import defpackage.apeo;
import defpackage.ipe;
import defpackage.utw;
import defpackage.ykw;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class CustomizationModel implements Iterable<apem>, Parcelable {
    public static final Parcelable.Creator<CustomizationModel> CREATOR = new aapv(2);
    public final ArrayList a;
    public boolean b;
    private final List c;

    public CustomizationModel() {
        this.b = false;
        this.a = new ArrayList();
        this.c = new ArrayList();
    }

    public static final boolean e(ykw ykwVar, apel apelVar, Boolean bool, boolean z) {
        int ordinal = apelVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 4) {
                if (ordinal == 6) {
                    return false;
                }
                if (ordinal != 7) {
                    if (ordinal != 8) {
                        return true;
                    }
                    if (!((Boolean) utw.c.e()).booleanValue() || ipe.b()) {
                        return false;
                    }
                    return true;
                }
                return ((Boolean) utw.b.e()).booleanValue();
            }
            if (z || bool == null || bool.booleanValue() || !ykwVar.q("is_eligible_for_wallet", false)) {
                return false;
            }
            return true;
        }
        if (((Boolean) utw.g.e()).booleanValue()) {
            return false;
        }
        return true;
    }

    public final int a() {
        return this.a.size();
    }

    public final apem b(int i) {
        return (apem) this.a.get(i);
    }

    public final void c() {
        this.c.clear();
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            apem apemVar = (apem) arrayList.get(i);
            if (apemVar.d) {
                this.c.add(apemVar);
            }
        }
    }

    public final void d(int i, boolean z) {
        aozy createBuilder = apem.a.createBuilder((apem) this.a.get(i));
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((apem) createBuilder.b).d = z;
        this.a.set(i, (apem) createBuilder.s());
        c();
        this.b = true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Iterable
    public final Iterator<apem> iterator() {
        return this.a.iterator();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        aozy createBuilder = apeo.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apeo apeoVar = (apeo) createBuilder.b;
        apax apaxVar = apeoVar.b;
        if (!apaxVar.c()) {
            apeoVar.b = apag.mutableCopy(apaxVar);
        }
        aoyj.addAll(this.a, apeoVar.b);
        parcel.writeParcelable(new ProtoParsers$InternalDontUse(null, (apeo) createBuilder.s()), 0);
        parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
    }

    public CustomizationModel(Parcel parcel) {
        this.b = false;
        apeo apeoVar = (apeo) ((apdj) parcel.readParcelable(apeo.class.getClassLoader())).a(apeo.a, aozs.a());
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        arrayList.addAll(apeoVar.b);
        this.b = parcel.readByte() != 0;
        this.c = new ArrayList();
        c();
    }
}
