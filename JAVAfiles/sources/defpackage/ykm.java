package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.text.TextUtils;
import j$.util.Optional;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ykm implements ykb {
    private static final xze c = xze.g("Bugle", "SubscriptionUtilsFake");
    public final yju a;
    public final ykl b;
    private final yjy d;
    private final mre e;

    static {
        "gbaKey".getBytes(StandardCharsets.UTF_8);
    }

    public ykm(yju yjuVar, yjy yjyVar, ykl yklVar, mre mreVar) {
        this.a = yjuVar;
        this.d = yjyVar;
        this.b = yklVar;
        this.e = mreVar;
    }

    @Override // defpackage.ykb
    public final String A(Context context) {
        return this.b.n;
    }

    @Override // defpackage.ykb
    public final boolean B(int i) {
        return false;
    }

    @Override // defpackage.ykb
    public final boolean C() {
        if (this.b.c != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ykb
    public final boolean D() {
        return false;
    }

    @Override // defpackage.ykb
    public final boolean E() {
        return false;
    }

    @Override // defpackage.ykb
    public final boolean F() {
        return false;
    }

    @Override // defpackage.ykb
    public final boolean G() {
        return this.b.b;
    }

    @Override // defpackage.ykb
    public final int[] H() {
        ykl yklVar = this.b;
        return new int[]{yklVar.j, yklVar.k};
    }

    @Override // defpackage.ykb
    public final int a() {
        return this.b.a;
    }

    @Override // defpackage.ykb
    public final int b() {
        return 0;
    }

    @Override // defpackage.ykb
    public final int c() {
        return 0;
    }

    @Override // defpackage.ykb
    public final int d() {
        return this.b.d;
    }

    @Override // defpackage.ykb
    public final int e() {
        return this.b.o;
    }

    @Override // defpackage.ykb
    public final Bitmap f(Context context) {
        return null;
    }

    @Override // defpackage.ykb
    public final SmsManager g() {
        return SmsManager.getSmsManagerForSubscriptionId(SmsManager.getDefaultSmsSubscriptionId());
    }

    @Override // defpackage.ykb
    public final msh h(String str) {
        return this.e.j(this.e.c(str, new yim(this, 15)), this.b.a);
    }

    @Override // defpackage.ykb
    public final Optional i() {
        return Optional.empty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [msh, java.lang.Object] */
    @Override // defpackage.ykb
    public final Optional j(boolean z) {
        Optional l = l(z);
        if (l.isEmpty()) {
            return Optional.empty();
        }
        String u = u();
        String o = this.d.g().o(albo.ag(l.get().i()), u);
        xze xzeVar = c;
        if (xzeVar.s(2)) {
            xyo d = xzeVar.d();
            d.H("SubscriptionUtils.getCanonicalForSelf: self=");
            d.j(o);
            d.z("country", u);
            d.H(u);
            d.q();
        }
        return Optional.of(this.e.h(l.get(), o));
    }

    @Override // defpackage.ykb
    public final Optional k() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("enableMultipartSMS", false);
        bundle.putInt("smsToMmsTextLengthThreshold", -1);
        bundle.putInt("systemCarrierConfig", 2);
        return Optional.of(bundle);
    }

    @Override // defpackage.ykb
    public final Optional l(boolean z) {
        return Optional.of(this.e.c(this.b.i, new yim(this, 16)));
    }

    @Override // defpackage.ykb
    public final Optional m() {
        if (TextUtils.isEmpty(this.b.i)) {
            return Optional.empty();
        }
        return Optional.of(this.b.i);
    }

    @Override // defpackage.ykb
    public final CharSequence n() {
        return this.b.g;
    }

    @Override // defpackage.ykb
    public final CharSequence o() {
        return this.b.e;
    }

    @Override // defpackage.ykb
    public final String p() {
        return albo.ag(this.b.c);
    }

    @Override // defpackage.ykb
    public final String q() {
        return "";
    }

    @Override // defpackage.ykb
    public final String r() {
        return this.b.m;
    }

    @Override // defpackage.ykb
    public final String s() {
        return this.b.g;
    }

    @Override // defpackage.ykb
    public final String t() {
        return this.b.f;
    }

    public final String toString() {
        return o().toString();
    }

    @Override // defpackage.ykb
    public final String u() {
        return this.b.l;
    }

    @Override // defpackage.ykb
    public final String v(Locale locale) {
        return this.b.l;
    }

    @Override // defpackage.ykb
    public final String w() {
        return this.b.h;
    }

    @Override // defpackage.ykb
    public final String x() {
        ykl yklVar = this.b;
        return yklVar.j + Integer.toString(yklVar.k);
    }

    @Override // defpackage.ykb
    public final String y() {
        return albo.ag(this.b.c);
    }

    @Override // defpackage.ykb
    public final String z() {
        return "";
    }
}
