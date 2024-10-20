package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.format.Formatter;
import j$.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jmf {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentUiDataConverter");
    private static final Set d;
    public final Context b;
    public final arpi c;
    private final arwe e;
    private final uet f;
    private final jmr g;
    private final afdm h;
    private final ovx i;
    private final izc j;

    static {
        int i = arsc.a;
        d = aqil.r(new artf[]{new arrh(afto.class), new arrh(aftq.class), new arrh(aftn.class), new arrh(afcw.class), new arrh(afqs.class), new arrh(afqc.class)});
    }

    public jmf(Context context, arwe arweVar, arpi arpiVar, uet uetVar, jmr jmrVar, afdm afdmVar, obk obkVar, ovx ovxVar, izc izcVar) {
        context.getClass();
        arweVar.getClass();
        arpiVar.getClass();
        jmrVar.getClass();
        afdmVar.getClass();
        obkVar.getClass();
        this.b = context;
        this.e = arweVar;
        this.c = arpiVar;
        this.f = uetVar;
        this.g = jmrVar;
        this.h = afdmVar;
        this.i = ovxVar;
        this.j = izcVar;
    }

    public static final boolean b(jha jhaVar) {
        jhaVar.getClass();
        if (jhaVar instanceof jgz) {
            return e(((jgz) jhaVar).a);
        }
        if (jhaVar instanceof jgv) {
            return e(((jgv) jhaVar).a);
        }
        if (jhaVar instanceof jgw) {
            return true;
        }
        throw new armm();
    }

    private final asai c(afcq afcqVar, Uri uri) {
        String str;
        int i = 3;
        if (afcqVar instanceof afto) {
            Uri parse = Uri.parse(afsy.a((afso) afcqVar, new afrw(i)).i());
            parse.getClass();
            return new aghw(new aejm(parse, uri, this.j.d((afcv) afcqVar)), 9);
        }
        arpe arpeVar = null;
        if (afcqVar instanceof aftq) {
            Uri parse2 = Uri.parse(afsy.a((afso) afcqVar, new afrx(0 == true ? 1 : 0)).i());
            parse2.getClass();
            return new aghw(new aejq(parse2, uri, this.j.d((afcv) afcqVar)), 9);
        }
        if (afcqVar instanceof aftn) {
            jmr jmrVar = this.g;
            aftn aftnVar = (aftn) afcqVar;
            String str2 = aftnVar.b;
            Duration duration = aftnVar.e;
            Uri parse3 = Uri.parse(str2);
            parse3.getClass();
            kbn a2 = jmrVar.d.a(parse3, duration, 2);
            ascd a3 = ascy.a(null);
            ascd a4 = ascy.a(false);
            List B = aqjn.B(a2.h, a2.f, a2.g, a2.j, a3);
            jfq jfqVar = new jfq(a3, a4, a2, 4, (char[]) null);
            long j = arut.a;
            Object b = jmrVar.c.b();
            b.getClass();
            long p = arsd.p(((Number) b).longValue(), aruv.c);
            asai[] asaiVarArr = (asai[]) aqjn.ax(B).toArray(new asai[0]);
            int length = asaiVarArr.length;
            boolean[] zArr = new boolean[length];
            for (int i2 = 0; i2 < length; i2++) {
                zArr[i2] = false;
            }
            int length2 = asaiVarArr.length;
            ArrayList arrayList = new ArrayList(length2);
            int i3 = 0;
            int i4 = 0;
            while (i3 < length2) {
                arrayList.add(new akee(asaiVarArr[i3], new jmk(zArr, i4, arpeVar, 0), 10));
                i3++;
                i4++;
                arpeVar = null;
            }
            return new akee((arqv) new jmo(jmrVar.b, p, asaiVarArr, zArr, (arpe) null, 0), (asai) new jmm((asai[]) aqjn.ax(arrayList).toArray(new asai[0]), jmrVar, aftnVar, jfqVar, a2, a4, a3), 4);
        }
        if (afcqVar instanceof afqs) {
            afrw afrwVar = new afrw(i);
            int i5 = afsy.a;
            Uri parse4 = Uri.parse(((afqr) afsy.d((afsn) afcqVar, afrwVar, afsz.b, null)).b);
            parse4.getClass();
            return new aghw(new aejm(parse4, uri, ((afqs) afcqVar).g()), 9);
        }
        if (afcqVar instanceof afqc) {
            Uri parse5 = Uri.parse(((afqc) afcqVar).b);
            parse5.getClass();
            return new aghw(new aejm(parse5, uri, this.j.d((afcv) afcqVar)), 9);
        }
        if (afcqVar instanceof afcw) {
            afcw afcwVar = (afcw) afcqVar;
            if (((ansy) ((ovw) this.i).a.b()).e("bugle.compose_row2_get_extension_on_background")) {
                String a5 = afcwVar.a.a();
                if (gh.y(a5)) {
                    return d(afcwVar, uri);
                }
                return new asaa(new jmd(afcwVar, this, a5, lga.bE(a5), null));
            }
            afsx afsxVar = afcwVar.a;
            String str3 = afcwVar.d;
            String a6 = afsxVar.a();
            if (str3 == null) {
                String c = gh.c(a6);
                if (c != null) {
                    str = c.toUpperCase(Locale.ROOT);
                    str.getClass();
                } else {
                    str = null;
                }
                if (str == null) {
                    str3 = a6;
                } else {
                    str3 = str;
                }
            }
            if (gh.y(a6)) {
                return d(afcwVar, uri);
            }
            return new aghw(new aejh(lga.bE(a6), str3, Formatter.formatFileSize(this.b, afcwVar.c), str3), 9);
        }
        throw new IllegalStateException("Attachment isConvertible, but no case for it exists");
    }

    private final ascv d(afcv afcvVar, Uri uri) {
        if (uri == null) {
            uri = Uri.parse(((afcw) afcvVar).b);
        }
        uet uetVar = this.f;
        uri.getClass();
        jjv jjvVar = new jjv(uetVar.a(uri), 11);
        arwe arweVar = this.e;
        int i = ascp.a;
        return arrn.T(jjvVar, arweVar, asco.a(1000L, 2), new aeje(""));
    }

    private static final boolean e(afcq afcqVar) {
        Set set = d;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (armd.d((artf) it.next()).isAssignableFrom(afcqVar.getClass())) {
                return true;
            }
        }
        return false;
    }

    public final asai a(jha jhaVar) {
        arrh arrhVar;
        Object aejiVar;
        jhaVar.getClass();
        if (b(jhaVar)) {
            if (jhaVar instanceof jgz) {
                jgz jgzVar = (jgz) jhaVar;
                return c(jgzVar.a, jgzVar.b.a);
            }
            if (jhaVar instanceof jgv) {
                return c(((jgv) jhaVar).a, null);
            }
            if (jhaVar instanceof jgw) {
                afru a2 = afrt.a(((jgw) jhaVar).a, this.h.d);
                if (a2 instanceof afrs) {
                    int i = arsc.a;
                    arrhVar = new arrh(aftn.class);
                } else if (a2 instanceof afsk) {
                    int i2 = arsc.a;
                    arrhVar = new arrh(afto.class);
                } else if (a2 instanceof aftm) {
                    int i3 = arsc.a;
                    arrhVar = new arrh(aftq.class);
                } else {
                    int i4 = arsc.a;
                    arrhVar = new arrh(afcw.class);
                }
                if (d.F(arrhVar, new arrh(afto.class))) {
                    aejiVar = new aejn();
                } else if (d.F(arrhVar, new arrh(aftq.class))) {
                    aejiVar = new aejr();
                } else if (d.F(arrhVar, new arrh(aftn.class))) {
                    aejiVar = new aeiw("", null, null, false, false, false, new aeiu());
                } else if (d.F(arrhVar, new arrh(afcw.class))) {
                    aejiVar = new aeji();
                } else {
                    throw new UnsupportedOperationException(a.cc(arrhVar, "Cannot convert unresolved ", " to AttachmentUiData"));
                }
                return new aghw(aejiVar, 9);
            }
            throw new armm();
        }
        throw new IllegalArgumentException(a.cc(jhaVar, "Cannot convert ", " to AttachmentUiData"));
    }
}
