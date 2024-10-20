package defpackage;

import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.PersistableBundle;
import com.google.android.apps.messaging.shared.datamodel.action.common.ActionParameters;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Optional;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rhs implements rhl {
    private final PersistableBundle a;
    private final Bundle b;

    public rhs() {
        this.a = new PersistableBundle();
        this.b = new Bundle();
    }

    @Override // defpackage.rhl
    public final byte[] A(String str) {
        return this.b.getByteArray(str);
    }

    @Override // defpackage.rhl
    public final String[] B(String str) {
        return this.a.getStringArray(str);
    }

    @Override // defpackage.rhl
    public final Bundle C() {
        return (Bundle) h("chat.extra.additionalMessageDetails");
    }

    @Override // defpackage.rhl
    public final Duration D() {
        return Duration.ofNanos(d("retry_delay"));
    }

    @Override // defpackage.rhl
    public final Parcelable[] E() {
        return this.b.getParcelableArray("messages");
    }

    @Override // defpackage.rhl
    public final ArrayList F(ArrayList arrayList) {
        ArrayList m = m("rcs.intent.extra.conversationClassifications");
        if (m == null) {
            return arrayList;
        }
        return m;
    }

    @Override // defpackage.rhl
    public final ArrayList G() {
        return this.b.getStringArrayList("message_ids");
    }

    @Override // defpackage.rhl
    public final void H(Duration duration) {
        k("retry_delay");
        s("retry_delay", duration.toNanos());
    }

    @Override // defpackage.rhl
    public final void I(Parcelable[] parcelableArr) {
        k("messages");
        this.b.putParcelableArray("messages", parcelableArr);
    }

    @Override // defpackage.rhl
    public final void J(ArrayList arrayList) {
        k("message_ids");
        this.b.putStringArrayList("message_ids", arrayList);
    }

    @Override // defpackage.rhl
    public final int a(String str) {
        return this.a.getInt(str);
    }

    @Override // defpackage.rhl
    public final int b(String str, int i) {
        return this.a.getInt(str, i);
    }

    public final alpt c() {
        alpr alprVar = new alpr();
        alprVar.j(this.b.keySet());
        alprVar.j(this.a.keySet());
        return alprVar.g();
    }

    @Override // defpackage.rhl
    public final long d(String str) {
        return this.a.getLong(str);
    }

    @Override // defpackage.rhl
    public final long e(String str, long j) {
        return this.a.getLong(str, j);
    }

    public final boolean equals(Object obj) {
        int i = 0;
        if (obj instanceof rhs) {
            rhs rhsVar = (rhs) obj;
            alpt c = c();
            if (c.equals(rhsVar.c())) {
                return Collection.EL.stream(c).allMatch(new rhq(this, rhsVar, i));
            }
        }
        return false;
    }

    @Override // defpackage.rhl
    public final BaseBundle f() {
        return this.a;
    }

    public final Object g(String str) {
        return Optional.ofNullable(this.a.get(str)).orElse(this.b.get(str));
    }

    @Override // defpackage.rhl
    public final Parcelable h(String str) {
        return this.b.getParcelable(str);
    }

    public final int hashCode() {
        return c().hashCode();
    }

    @Override // defpackage.rhl
    public final ActionParameters i() {
        Bundle bundle = new Bundle(this.b);
        bundle.putAll(this.a);
        return new ActionParameters(bundle);
    }

    @Override // defpackage.rhl
    public final Optional j() {
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putPersistableBundle("PERSISTABLE_ACTION_PARAMETERS_PERSISTABLE_BUNDLE", this.a);
        if (this.b.size() > 0) {
            persistableBundle.putString("PERSISTABLE_ACTION_PARAMETERS_SERIALIZED_LEGACY_ACTION_PARAMETERS", rik.b(new ActionParameters(this.b)));
        }
        return Optional.of(persistableBundle);
    }

    public final void k(String str) {
        this.a.remove(str);
        this.b.remove(str);
    }

    @Override // defpackage.rhl
    public final String l(String str) {
        return this.a.getString(str);
    }

    @Override // defpackage.rhl
    public final ArrayList m(String str) {
        return this.b.getParcelableArrayList(str);
    }

    @Override // defpackage.rhl
    public final ArrayList n(String str, Class cls) {
        ArrayList parcelableArrayList;
        if (!yhx.h) {
            return this.b.getParcelableArrayList(str);
        }
        parcelableArrayList = this.b.getParcelableArrayList(str, cls);
        return parcelableArrayList;
    }

    @Override // defpackage.rhl
    public final void p(String str, boolean z) {
        k(str);
        this.a.putBoolean(str, z);
    }

    @Override // defpackage.rhl
    public final void q(String str, byte[] bArr) {
        k(str);
        this.b.putByteArray(str, bArr);
    }

    @Override // defpackage.rhl
    public final void r(String str, int i) {
        k(str);
        this.a.putInt(str, i);
    }

    @Override // defpackage.rhl
    public final void s(String str, long j) {
        k(str);
        this.a.putLong(str, j);
    }

    @Override // defpackage.rhl
    public final void t(String str, Parcelable parcelable) {
        k(str);
        this.b.putParcelable(str, parcelable);
    }

    @Override // defpackage.rhl
    public final void u(String str, ArrayList arrayList) {
        k(str);
        this.b.putParcelableArrayList(str, arrayList);
    }

    @Override // defpackage.rhl
    public final void v(String str, String str2) {
        k(str);
        this.a.putString(str, str2);
    }

    @Override // defpackage.rhl
    public final void w(String str, String[] strArr) {
        k(str);
        this.a.putStringArray(str, strArr);
    }

    @Override // defpackage.rhl
    public final boolean x(String str) {
        if (!this.b.containsKey(str) && !this.a.containsKey(str)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.rhl
    public final boolean y(String str) {
        return this.a.getBoolean(str);
    }

    @Override // defpackage.rhl
    public final boolean z(String str, boolean z) {
        return this.a.getBoolean(str, z);
    }

    public rhs(PersistableBundle persistableBundle) {
        this.a = (PersistableBundle) Optional.ofNullable(persistableBundle.getPersistableBundle("PERSISTABLE_ACTION_PARAMETERS_PERSISTABLE_BUNDLE")).map(new rhr(0)).orElse(new PersistableBundle());
        this.b = (Bundle) Optional.ofNullable(persistableBundle.getString("PERSISTABLE_ACTION_PARAMETERS_SERIALIZED_LEGACY_ACTION_PARAMETERS")).map(new rhr(2)).map(new rhr(3)).map(new rhr(4)).orElse(new Bundle());
    }
}
