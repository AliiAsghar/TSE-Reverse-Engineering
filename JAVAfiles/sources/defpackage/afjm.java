package defpackage;

import com.google.android.apps.messaging.R;
import j$.util.Optional;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afjm extends arrp implements arqg {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afjm(Object obj, int i) {
        super(0);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v105, types: [java.lang.Object, aneo] */
    /* JADX WARN: Type inference failed for: r0v49, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v53, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v55, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v94, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object, aneo] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, aneo] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, aneo] */
    @Override // defpackage.arqg
    public final /* synthetic */ Object a() {
        long skip;
        Object obj;
        Object obj2;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        byte[] bArr = null;
        boolean z3 = false;
        boolean z4 = false;
        switch (this.b) {
            case 0:
                afjn afjnVar = (afjn) this.a;
                return arrn.I(afjnVar.b, null, null, new aely(afjnVar, (arpe) null, 14), 3);
            case 1:
                alvg alvgVar = (alvg) afiv.a.f().h("com/google/android/libraries/compose/core/data/content/InputStreamSizeCalculator$sizeBytes$1", "invoke", 38, "InputStreamSizeCalculator.kt");
                Object obj3 = this.a;
                alvgVar.B("%s.available(): %d", obj3.getClass(), ((InputStream) obj3).available());
                long j = 0;
                do {
                    skip = ((InputStream) this.a).skip(r6.available());
                    j += skip;
                    i++;
                } while (skip > 0);
                if (((InputStream) this.a).available() > 0) {
                    ((alvg) afiv.a.h().h("com/google/android/libraries/compose/core/data/content/InputStreamSizeCalculator$sizeBytes$1", "invoke", 50, "InputStreamSizeCalculator.kt")).t("%s skipped 0 bytes but still has bytes available", this.a.getClass());
                } else if (((InputStream) this.a).read() != -1) {
                    ((alvg) afiv.a.h().h("com/google/android/libraries/compose/core/data/content/InputStreamSizeCalculator$sizeBytes$1", "invoke", 54, "InputStreamSizeCalculator.kt")).t("%s reported 0 available but read() has not reached end of stream", this.a.getClass());
                }
                ((alvg) afiv.a.f().h("com/google/android/libraries/compose/core/data/content/InputStreamSizeCalculator$sizeBytes$1", "invoke", 57, "InputStreamSizeCalculator.kt")).r("InputStream.sizeBytes() skipCount: %d", i);
                return Long.valueOf(j);
            case 2:
                afjn afjnVar2 = (afjn) this.a;
                return arrn.I(afjnVar2.b, null, null, new aely(afjnVar2, (arpe) null, 15, (byte[]) null), 3);
            case 3:
                return ((mrr) this.a).a;
            case 4:
                if (!((afln) this.a).b.isEmpty()) {
                    afnd afndVar = afne.a;
                    StringBuilder sb = afne.a.get();
                    afln aflnVar = (afln) this.a;
                    sb.append(((aflq) aqjn.W(aflnVar.b)).f.a());
                    sb.append(aflw.c.a());
                    sb.append(aflnVar.a);
                    sb.append(aflw.d.a());
                    return sb.toString();
                }
                return ((afln) this.a).a;
            case 5:
                afmd afmdVar = (afmd) this.a;
                return arrn.J(afmdVar.a, null, null, new afbh(afmdVar, (arpe) null, 6), 3);
            case 6:
                afmd afmdVar2 = (afmd) this.a;
                return arrn.J(afmdVar2.a, null, null, new afmg(afmdVar2, (arpe) null, 1), 3);
            case 7:
                Object b = this.a.b();
                b.getClass();
                Optional optional = (Optional) b;
                if (optional.isPresent()) {
                    obj = optional.get();
                } else {
                    obj = new afnx(z4 ? 1 : 0, z3 ? 1 : 0, z2 ? 1 : 0, 511);
                }
                return ((afnx) obj).a;
            case 8:
                if (((afmu) this.a).b() != aflq.d || ((afmu) this.a).c() != aflq.c) {
                    afmu afmuVar = (afmu) this.a;
                    if (afmuVar.b() != aflq.c || afmuVar.c() != aflq.d) {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            case 9:
                return ((afnb) this.a).f();
            case 10:
                char[] chars = Character.toChars(((afnc) this.a).a);
                chars.getClass();
                return new String(chars);
            case 11:
                ((afnf) this.a).b.b();
                return new aguh(((afnf) this.a).a);
            case 12:
                afng afngVar = (afng) this.a;
                if (afngVar.b) {
                    afngVar.e.b();
                }
                return new aguh(((afng) this.a).a);
            case 13:
                return ((afni) this.a).b.e(new afka(31));
            case 14:
                Object b2 = this.a.b();
                b2.getClass();
                Optional optional2 = (Optional) b2;
                if (optional2.isPresent()) {
                    obj2 = optional2.get();
                } else {
                    obj2 = new aflz(bArr);
                }
                return Boolean.valueOf(((aflz) obj2).a);
            case 15:
                Object obj4 = this.a;
                agtj agtjVar = agtj.b;
                afxz afxzVar = (afxz) obj4;
                ?? r2 = afxzVar.c;
                ?? r3 = afxzVar.e;
                ?? r4 = afxzVar.b;
                ?? r0 = afxzVar.d;
                if (agtjVar == null) {
                    synchronized (agtj.class) {
                        agtjVar = agtj.b;
                        if (agtjVar == null) {
                            agtjVar = new agtj(r0, r4, r3, r2);
                            agtj.b = agtjVar;
                        }
                    }
                }
                return agtjVar;
            case 16:
                return new ahjj(this.a, (byte[]) null);
            case 17:
                return Integer.valueOf(((cg) this.a).z().getDimensionPixelSize(R.dimen.emoji_tab_height));
            case 18:
                afof afofVar = (afof) this.a;
                arwe arweVar = afofVar.a;
                if (arweVar == null) {
                    arro.b("cpuBoundScope");
                    arweVar = null;
                }
                afofVar.ai = arrn.I(arweVar, null, null, new afmg((afof) this.a, (arpe) null, 6), 3);
                return Boolean.valueOf(((afof) this.a).a().d());
            case 19:
                return this.a;
            default:
                Object obj5 = this.a;
                return arrn.J(((agai) obj5).bo(), null, null, new afmg((afof) obj5, (arpe) null, 7, (byte[]) null), 3);
        }
    }
}
