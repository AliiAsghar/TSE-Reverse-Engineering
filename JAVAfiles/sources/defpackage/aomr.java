package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aomr implements andy {
    final /* synthetic */ aong a;
    final /* synthetic */ ahjd b;

    public aomr(ahjd ahjdVar, aong aongVar) {
        this.a = aongVar;
        this.b = ahjdVar;
    }

    @Override // defpackage.andy
    public final void a(Throwable th) {
        Log.e("ClientLoggingBackend", "Error while logging.", th);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [armf, java.lang.Object] */
    @Override // defpackage.andy
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ambj b;
        abnr a;
        int i;
        long k;
        String str = (String) obj;
        aong aongVar = this.a;
        anav anavVar = aongVar.g;
        if (anavVar == null) {
            anavVar = anav.a;
        }
        ahjd ahjdVar = this.b;
        String str2 = anavVar.i;
        Charset charset = aomm.a;
        int i2 = ambp.a;
        ambk ambkVar = amcb.a;
        Charset charset2 = aomm.a;
        if (StandardCharsets.UTF_8.equals(charset2)) {
            int length = str2.length();
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                int i6 = i3 + 4;
                if (i6 > length) {
                    break;
                }
                char charAt = str2.charAt(i3);
                char charAt2 = str2.charAt(i3 + 1);
                char charAt3 = str2.charAt(i3 + 2);
                char charAt4 = str2.charAt(i3 + 3);
                if (charAt >= 128 || charAt2 >= 128 || charAt3 >= 128 || charAt4 >= 128) {
                    break;
                }
                i4 = amcb.i(i4, amcb.j((charAt4 << 24) | (charAt3 << 16) | (charAt2 << '\b') | charAt));
                i5 += 4;
                i3 = i6;
            }
            int i7 = 0;
            long j = 0;
            while (true) {
                if (i3 < length) {
                    char charAt5 = str2.charAt(i3);
                    if (charAt5 < 128) {
                        i = length;
                        k = (charAt5 << i7) | j;
                        i5++;
                        i7 += 8;
                    } else {
                        i = length;
                        if (charAt5 < 2048) {
                            k = (amcb.l(charAt5) << i7) | j;
                            i5 += 2;
                            i7 += 16;
                        } else if (charAt5 >= 55296 && charAt5 <= 57343) {
                            int codePointAt = Character.codePointAt(str2, i3);
                            if (codePointAt == charAt5) {
                                b = ((amaz) ambkVar).b(str2.toString().getBytes(charset2));
                                break;
                            } else {
                                k = (amcb.m(codePointAt) << i7) | j;
                                i5 += 4;
                                i7 += 32;
                                i3++;
                            }
                        } else {
                            k = (amcb.k(charAt5) << i7) | j;
                            i5 += 3;
                            i7 += 24;
                        }
                    }
                    if (i7 >= 32) {
                        i4 = amcb.i(i4, amcb.j((int) k));
                        k >>>= 32;
                        i7 -= 32;
                    }
                    j = k;
                    i3++;
                    length = i;
                } else {
                    b = amcb.n(amcb.j((int) j) ^ i4, i5);
                    break;
                }
            }
        } else {
            b = ((amaz) ambkVar).b(str2.toString().getBytes(charset2));
        }
        Object obj2 = ahjdVar.a;
        int a2 = b.a();
        aoms aomsVar = (aoms) obj2;
        zfj zfjVar = aomsVar.b;
        boolean f = ((algw) zfjVar.a.b()).f();
        Context context = aomsVar.a;
        if (!f) {
            a = new abnr(context, "CLIENT_LOGGING_PROD", str);
        } else {
            abnm abnmVar = new abnm(context, "CLIENT_LOGGING_PROD");
            abns abnsVar = (abns) ((algw) zfjVar.a.b()).e();
            if (abnsVar != null) {
                abnmVar.c = abnsVar;
            }
            if (str != null) {
                abnmVar.g = str;
            }
            a = abnmVar.a();
        }
        abnq h = a.h(aongVar, aglt.b(aomsVar.a, new apzh()));
        h.i(a2);
        ListenableFuture f2 = ancj.f(agkx.f(h.c()), new algm(null), andi.a);
        f2.c(new aomp(f2, 0), andi.a);
        ancd.f(f2, Exception.class, akto.a(new akdg(19)), andi.a);
    }
}
