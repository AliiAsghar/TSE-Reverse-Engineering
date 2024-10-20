package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import java.io.ByteArrayInputStream;
import java.security.GeneralSecurityException;
import java.util.HashSet;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahmn {
    public final Object a;

    public ahmn(Object obj) {
        this.a = obj;
    }

    public static ahmn G(annb annbVar) {
        return new ahmn(annbVar.a.toBuilder(), null);
    }

    public static ahmn H(byte[] bArr) {
        return new ahmn(new ByteArrayInputStream(bArr), null);
    }

    private final byte[] I(byte[] bArr, byte[] bArr2, int i) {
        Mac mac = (Mac) aobo.b.a((String) this.a);
        if (i <= mac.getMacLength() * 255) {
            byte[] bArr3 = new byte[i];
            mac.init(new SecretKeySpec(bArr, (String) this.a));
            byte[] bArr4 = new byte[0];
            int i2 = 1;
            int i3 = 0;
            while (true) {
                mac.update(bArr4);
                mac.update(bArr2);
                mac.update((byte) i2);
                bArr4 = mac.doFinal();
                int length = bArr4.length;
                int i4 = i3 + length;
                if (i4 < i) {
                    System.arraycopy(bArr4, 0, bArr3, i3, length);
                    i2++;
                    i3 = i4;
                } else {
                    System.arraycopy(bArr4, 0, bArr3, i3, i - i3);
                    return bArr3;
                }
            }
        } else {
            throw new GeneralSecurityException("size too large");
        }
    }

    private final byte[] J(byte[] bArr, byte[] bArr2) {
        Mac mac = (Mac) aobo.b.a((String) this.a);
        if (bArr2 != null && bArr2.length != 0) {
            mac.init(new SecretKeySpec(bArr2, (String) this.a));
        } else {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], (String) this.a));
        }
        return mac.doFinal(bArr);
    }

    public static /* synthetic */ void l(akuh akuhVar) {
        if (akqj.u()) {
            return;
        }
        ahmn ahmnVar = akuhVar.c;
        ((aksr) ahmnVar.a).b(akuhVar.b).close();
    }

    public final void A(int i) {
        aozy aozyVar = (aozy) this.a;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amtx amtxVar = (amtx) aozyVar.b;
        amtx amtxVar2 = amtx.a;
        amtxVar.c = i - 1;
        amtxVar.b |= 1;
    }

    public final /* synthetic */ amwv B() {
        apag s = ((aozy) this.a).s();
        s.getClass();
        return (amwv) s;
    }

    public final void C(amva amvaVar) {
        amvaVar.getClass();
        aozy aozyVar = (aozy) this.a;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amwv amwvVar = (amwv) aozyVar.b;
        amwv amwvVar2 = amwv.a;
        amwvVar.d = amvaVar;
        amwvVar.b |= 2;
    }

    public final void D(amwt amwtVar) {
        amwtVar.getClass();
        aozy aozyVar = (aozy) this.a;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amwv amwvVar = (amwv) aozyVar.b;
        amwv amwvVar2 = amwv.a;
        amwvVar.c = amwtVar.E;
        amwvVar.b |= 1;
    }

    public final andc E(agrk agrkVar) {
        return ((aixj) this.a).b().e(akto.e(new xsj(agrkVar, 6)), andi.a);
    }

    public final ListenableFuture F(agrk agrkVar) {
        return ((aixj) this.a).b().e(akto.e(new xsj(agrkVar, 7)), andi.a).l();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final ahro a(float f) {
        Random random = (Random) this.a.b();
        random.getClass();
        return new ahro(random, f);
    }

    public final boolean b(CharSequence charSequence, ahwe ahweVar) {
        String str = ahweVar.a;
        if (str.length() == 0) {
            return false;
        }
        Matcher matcher = ((adxs) this.a).f(str).matcher(charSequence);
        if (!matcher.lookingAt() || !matcher.matches()) {
            return false;
        }
        return true;
    }

    public final int c() {
        return ((AtomicInteger) this.a).get();
    }

    public final String d() {
        long j;
        try {
            abrc abrcVar = new abrc((Context) this.a, (byte[]) null);
            ajxp ajxpVar = new ajxp(null);
            ajxpVar.c = new abxb(8);
            ajxpVar.b = 3901;
            acir g = abrcVar.g(ajxpVar.b());
            if (true != aizr.k((Context) this.a)) {
                j = 1000;
            } else {
                j = 3000;
            }
            return a.cp(((PseudonymousIdToken) actx.v(g, j, TimeUnit.MILLISECONDS)).a, "NID=");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            Log.e("SurveyPseudonymousIdProviderZwieback", "Task was interrupted while fetching Zwieback ID.", e);
            return "";
        } catch (ExecutionException e2) {
            Log.e("SurveyPseudonymousIdProviderZwieback", "Task failed while fetching Zwieback ID.", e2);
            return "";
        } catch (TimeoutException e3) {
            Log.e("SurveyPseudonymousIdProviderZwieback", "Task timed out while fetching Zwieback ID.", e3);
            return "";
        }
    }

    public final ListenableFuture e(aixs aixsVar) {
        return ((aixj) this.a).b().e(akto.e(new xsj(aixsVar, 8)), andi.a).l();
    }

    public final ListenableFuture f(aixt aixtVar) {
        return ((aixj) this.a).b().e(akto.e(new xsj(aixtVar, 9)), andi.a).l();
    }

    public final ListenableFuture g(ListenableFuture listenableFuture) {
        Object obj = this.a;
        return ancj.g(listenableFuture, akto.d(new ahce(obj, 11)), ((aiws) obj).c);
    }

    public final akul h(Callable callable, Executor executor) {
        return akul.g(((akmy) this.a).m(callable, executor));
    }

    public final akul i(ancr ancrVar, Executor executor) {
        return akul.g(((akmy) this.a).n(ancrVar, executor));
    }

    public final akul j(Runnable runnable, Executor executor) {
        return akul.g(((atkn) ((akmy) this.a).a).a(new alca(akto.j(runnable), 2), executor));
    }

    public final ListenableFuture k(ancr ancrVar, Executor executor) {
        return ((andr) this.a).b(akto.c(ancrVar), executor);
    }

    public final aksa m(String str) {
        akqj.r();
        int i = 4;
        if (akqj.u()) {
            return new akqh(4);
        }
        return new akpq((Object) ((aksr) this.a).b(str), i);
    }

    public final aksa n(String str, String str2) {
        Object i;
        if (akqj.u()) {
            i = alfd.a;
        } else {
            i = algw.i(((aksr) this.a).d("Invoking ".concat(str)));
        }
        return new akpo(aktp.e(a.co(str2, str, ".")), i, 4, null);
    }

    public final int o() {
        return Mac.getInstance((String) this.a).getMacLength();
    }

    public final byte[] p() {
        char c;
        String str = (String) this.a;
        int hashCode = str.hashCode();
        if (hashCode != 984523022) {
            if (hashCode != 984524074) {
                if (hashCode == 984525777 && str.equals("HmacSha512")) {
                    c = 2;
                }
                c = 65535;
            } else {
                if (str.equals("HmacSha384")) {
                    c = 1;
                }
                c = 65535;
            }
        } else {
            if (str.equals("HmacSha256")) {
                c = 0;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                if (c == 2) {
                    return ansf.h;
                }
                throw new GeneralSecurityException("Could not determine HPKE KDF ID");
            }
            return ansf.g;
        }
        return ansf.f;
    }

    public final byte[] q(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, int i) {
        return I(bArr, ansf.e(str, bArr2, bArr3, i), i);
    }

    public final byte[] r(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return J(ansf.d(str, bArr2, bArr3), bArr);
    }

    public final byte[] s(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        return I(J(ansf.d("eae_prk", bArr, bArr3), null), ansf.e("shared_secret", bArr2, bArr3, i), i);
    }

    public final synchronized annb t() {
        return annb.b((anxi) ((aozy) this.a).s());
    }

    public final anxg u() {
        try {
            Object obj = this.a;
            if (obj instanceof antg) {
                return ((antg) obj).e.b;
            }
            return ((anub) antq.a.h((anme) this.a, anub.class)).b;
        } catch (GeneralSecurityException e) {
            throw new anuj("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat(String.valueOf(String.valueOf(this.a))), e);
        }
    }

    public final Object v() {
        return albo.bQ(((andc) this.a).c);
    }

    public final void w() {
        ((andc) this.a).i();
    }

    public final void x(Object obj, Executor executor) {
        executor.getClass();
        if (obj != null) {
            ((ancw) this.a).a((AutoCloseable) obj, executor);
        }
    }

    public final /* synthetic */ amtx y() {
        apag s = ((aozy) this.a).s();
        s.getClass();
        return (amtx) s;
    }

    public final void z(amwv amwvVar) {
        aozy aozyVar = (aozy) this.a;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amtx amtxVar = (amtx) aozyVar.b;
        amtx amtxVar2 = amtx.a;
        amtxVar.d = amwvVar;
        amtxVar.b |= 2;
    }

    public ahmn(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public ahmn(aksr aksrVar) {
        aksrVar.getClass();
        this.a = aksrVar;
    }

    public ahmn(alpt alptVar) {
        alpr i = alpt.i(alptVar.size());
        aluq listIterator = alptVar.listIterator();
        while (listIterator.hasNext()) {
            i.c(albo.aq((String) listIterator.next()));
        }
        this.a = i.g();
    }

    public ahmn(armf armfVar) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public ahmn(byte[] bArr) {
        this.a = new AtomicInteger();
    }

    public ahmn(short[] sArr) {
        this.a = new andr();
    }

    public ahmn() {
        this.a = new adxs();
    }

    public ahmn(int[] iArr) {
        this.a = algc.l("\r\n,\t");
    }

    public ahmn(char[] cArr) {
        this.a = DesugarCollections.synchronizedSet(new HashSet());
    }
}
