package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ndk {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ndk(arzu arzuVar, mum mumVar) {
        this.a = arzuVar;
        this.b = mumVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ncp] */
    public final void a() {
        qiu.h(this.b.a());
    }

    public final Uri b() {
        String o = ((ssi) this.b).o();
        if (o != null) {
            return Uri.parse(o);
        }
        return null;
    }

    public final Uri c() {
        return Uri.parse(((ssi) this.b).q());
    }

    public final String d() {
        return ((ssi) this.b).l();
    }

    public final String e() {
        String m = ((ssi) this.b).m();
        if (m == null) {
            return "";
        }
        return m;
    }

    public final String f() {
        String n = ((ssi) this.b).n();
        if (n == null) {
            return "";
        }
        return n;
    }

    public final String g() {
        String p = ((ssi) this.b).p();
        if (p == null) {
            return "";
        }
        return p;
    }

    public final boolean h() {
        if (((xnv) ((nar) this.a).a).f().toEpochMilli() > ((ssi) this.b).h()) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        return ((ssi) this.b).r();
    }

    public final void j(int i) {
        if (i != 0) {
            mfh.a.q(a.bV(i, "Bad response code: "));
            ((dtq) this.a).b(Optional.empty());
            return;
        }
        try {
            Object obj = this.b;
            if (((hin) obj).a()) {
                Bundle bundle = new Bundle();
                bundle.putString("package_name", ((hin) obj).c);
                try {
                    String string = ((hin) obj).d.getInstallReferrer(bundle).getString("install_referrer");
                    if (TextUtils.isEmpty(string)) {
                        mfh.a.o("Empty referrer");
                        ((dtq) this.a).b(Optional.empty());
                        return;
                    }
                    ((dtq) this.a).b(Optional.of(string.substring(0, Math.min(string.length(), 100))));
                    return;
                } catch (RemoteException e) {
                    gvf.R("RemoteException getting install referrer information");
                    ((hin) obj).a = 0;
                    throw e;
                }
            }
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        } catch (RemoteException e2) {
            mfh.a.r("Error talking to Referrer API", e2);
            ((dtq) this.a).b(Optional.empty());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [mbn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.concurrent.ScheduledExecutorService, java.lang.Object] */
    public final aboj k(abnr abnrVar) {
        aboj abojVar = new aboj(abnrVar, "BUGLE_COUNTERS", Integer.MAX_VALUE);
        abojVar.i(this.a.a());
        abojVar.h(this.b, mbe.a);
        return abojVar;
    }

    public ndk(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public ndk(Object obj, Object obj2, byte[] bArr) {
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ ndk(Object obj, Object obj2, char[] cArr) {
        this.b = obj;
        this.a = obj2;
    }
}
