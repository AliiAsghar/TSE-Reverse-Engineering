package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.telephony.SmsManager;
import android.text.TextUtils;
import j$.util.Optional;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ykn implements ykb {
    private static final alvi c = alvi.m("com/google/android/apps/messaging/shared/util/phone/SubscriptionUtilsImpl");
    public final int a;
    public final yju b;
    private final yjy d;
    private final mre e;
    private final yjo f;
    private final armf g;
    private final ykb h;

    public ykn(yjy yjyVar, mre mreVar, yju yjuVar, armf armfVar, yjo yjoVar, ykb ykbVar, int i) {
        this.a = i;
        this.d = yjyVar;
        this.e = mreVar;
        this.b = yjuVar;
        this.f = yjoVar;
        this.h = ykbVar;
        this.g = armfVar;
    }

    @Override // defpackage.ykb
    public final String A(Context context) {
        return this.h.A(context);
    }

    @Override // defpackage.ykb
    public final boolean B(int i) {
        return this.h.B(i);
    }

    @Override // defpackage.ykb
    public final boolean C() {
        return this.h.C();
    }

    @Override // defpackage.ykb
    public final boolean D() {
        return this.h.D();
    }

    @Override // defpackage.ykb
    public final boolean E() {
        return this.h.E();
    }

    @Override // defpackage.ykb
    public final boolean F() {
        return this.h.F();
    }

    @Override // defpackage.ykb
    public final boolean G() {
        return this.h.G();
    }

    @Override // defpackage.ykb
    public final int[] H() {
        return this.h.H();
    }

    @Override // defpackage.ykb
    public final int a() {
        return this.a;
    }

    @Override // defpackage.ykb
    public final int b() {
        return this.h.b();
    }

    @Override // defpackage.ykb
    public final int c() {
        return this.h.c();
    }

    @Override // defpackage.ykb
    public final int d() {
        return this.h.d();
    }

    @Override // defpackage.ykb
    public final int e() {
        return this.h.e();
    }

    @Override // defpackage.ykb
    public final Bitmap f(Context context) {
        return this.h.f(context);
    }

    @Override // defpackage.ykb
    public final SmsManager g() {
        return this.h.g();
    }

    @Override // defpackage.ykb
    public final msh h(String str) {
        return this.e.j(this.e.c(str, new yim(this, 17)), this.a);
    }

    @Override // defpackage.ykb
    public final Optional i() {
        return this.h.i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [msh, java.lang.Object] */
    @Override // defpackage.ykb
    public final Optional j(boolean z) {
        Optional l = l(z);
        if (l.isEmpty()) {
            return Optional.empty();
        }
        String u = u();
        String o = this.d.g().o(albo.ag(l.get().i()), u);
        alvw g = c.g();
        g.X(alwp.a, "Bugle");
        alvg alvgVar = (alvg) g;
        alvgVar.X(ydl.t, Integer.valueOf(this.a));
        ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/util/phone/SubscriptionUtilsImpl", "getCanonicalForSelf", 280, "SubscriptionUtilsImpl.java")).D("SubscriptionUtils.getCanonicalForSelf: self=%s, country=%s", yyb.bh(o), u);
        return Optional.of(this.e.h(l.get(), o));
    }

    @Override // defpackage.ykb
    public final Optional k() {
        return this.h.k();
    }

    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.ykb
    public final Optional l(boolean z) {
        if (z) {
            String c2 = this.f.c(this.a);
            if (!TextUtils.isEmpty(c2)) {
                return Optional.of(this.e.c(c2, new yim(this, 18)));
            }
        }
        if (this.f.d()) {
            alvw g = c.g();
            g.X(alwp.a, "Bugle");
            alvg alvgVar = (alvg) g;
            alvgVar.X(ydl.t, Integer.valueOf(this.a));
            ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/util/phone/SubscriptionUtilsImpl", "getMessagingIdentity", 173, "SubscriptionUtilsImpl.java")).q("getMessagingIdentity: Emulating unknown SIM number");
            return Optional.empty();
        }
        Optional m = this.h.m();
        if (m.isEmpty()) {
            alvw d = c.d();
            d.X(alwp.a, "Bugle");
            alvg alvgVar2 = (alvg) d;
            alvgVar2.X(ydl.t, Integer.valueOf(this.a));
            ((alvg) alvgVar2.h("com/google/android/apps/messaging/shared/util/phone/SubscriptionUtilsImpl", "getMessagingIdentity", 181, "SubscriptionUtilsImpl.java")).q("String phone number for self is empty!");
            return Optional.empty();
        }
        String u = u();
        if (!((anhn) this.g.b()).c((String) m.get(), u)) {
            alvw g2 = c.g();
            g2.X(alwp.a, "Bugle");
            alvg alvgVar3 = (alvg) g2;
            alvgVar3.X(ydl.t, Integer.valueOf(this.a));
            ((alvg) alvgVar3.h("com/google/android/apps/messaging/shared/util/phone/SubscriptionUtilsImpl", "getMessagingIdentity", 189, "SubscriptionUtilsImpl.java")).D("Delegate phone number for self is invalid! With country=%s and number=%s", u, yyb.bh(m.get()));
            return Optional.empty();
        }
        return Optional.of(this.e.c((String) m.get(), new yim(u, 19)));
    }

    @Override // defpackage.ykb
    public final Optional m() {
        throw new UnsupportedOperationException("getRawSelfNumber should not be public");
    }

    @Override // defpackage.ykb
    public final CharSequence n() {
        return this.h.n();
    }

    @Override // defpackage.ykb
    public final CharSequence o() {
        return this.h.o();
    }

    @Override // defpackage.ykb
    public final String p() {
        return this.h.p();
    }

    @Override // defpackage.ykb
    public final String q() {
        return this.h.q();
    }

    @Override // defpackage.ykb
    public final String r() {
        return this.h.r();
    }

    @Override // defpackage.ykb
    public final String s() {
        return this.h.s();
    }

    @Override // defpackage.ykb
    public final String t() {
        return this.h.t();
    }

    public final String toString() {
        return o().toString();
    }

    @Override // defpackage.ykb
    public final String u() {
        String u = this.h.u();
        if (TextUtils.isEmpty(u)) {
            return "";
        }
        return u.toUpperCase(Locale.US);
    }

    @Override // defpackage.ykb
    public final String v(Locale locale) {
        return u();
    }

    @Override // defpackage.ykb
    public final String w() {
        return this.h.w();
    }

    @Override // defpackage.ykb
    public final String x() {
        return this.h.x();
    }

    @Override // defpackage.ykb
    public final String y() {
        return this.h.y();
    }

    @Override // defpackage.ykb
    public final String z() {
        return this.h.z();
    }
}
