package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.format.Formatter;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kdn {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/richcards/RichCardBubbleUiAdapter");
    public final Context b;
    public final arwe c;
    public final ConversationId d;
    public final mjg e;
    public final arqr f;
    public final arqv g;
    public final arqr h;
    public final arqr i;
    public final arqr j;
    public final lkd k;
    private final armf l;
    private final qdq m;

    public kdn(Context context, arwe arweVar, ConversationId conversationId, mjg mjgVar, qdq qdqVar, armf armfVar, lkd lkdVar) {
        context.getClass();
        arweVar.getClass();
        conversationId.getClass();
        mjgVar.getClass();
        armfVar.getClass();
        lkdVar.getClass();
        this.b = context;
        this.c = arweVar;
        this.d = conversationId;
        this.e = mjgVar;
        this.m = qdqVar;
        this.l = armfVar;
        this.k = lkdVar;
        this.f = qkf.f(new jya((Object) this, 7, (byte[][]) null), arweVar);
        this.g = qkf.g(new ifp((Object) this, 8, (char[][]) null), arweVar);
        this.h = qkf.f(new jya((Object) this, 8, (char[][]) null), arweVar);
        this.i = qkf.f(new jya((Object) this, 9, (short[][]) null), arweVar);
        this.j = qkf.f(new jya(this, 6, (float[]) null), arweVar);
    }

    private final List d(List list) {
        ArrayList arrayList = new ArrayList(aqjn.J(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((khg) this.l.b()).a((mqz) it.next());
            arrayList.add(null);
        }
        return aqjn.an(arrayList);
    }

    private final aexn e(kdl kdlVar, mxr mxrVar) {
        Uri uri;
        myn mynVar = mxrVar.c;
        mxq mxqVar = (mxq) mynVar;
        Uri uri2 = null;
        if (!d.F(mxqVar.b, Uri.EMPTY)) {
            if (gh.z(mxqVar.a)) {
                Uri uri3 = mxqVar.b;
                uri3.getClass();
                Optional map = mxqVar.c.map(new ivi(jyp.d, 17));
                map.getClass();
                return new aexl(uri3, (String) arsd.k(map), new kdg(this, mxrVar, 3, null), new kdg(this, mynVar, 4, null));
            }
            Uri uri4 = mxqVar.b;
            uri4.getClass();
            return new aexk(uri4, new kdg(this, mxrVar, 5, null), new kdg(this, mynVar, 6, null));
        }
        myz myzVar = mxqVar.e;
        if (myzVar != null && myzVar.b) {
            aexh f = f(mxrVar);
            myn mynVar2 = mxrVar.b;
            if (mynVar2 != null) {
                uri = mynVar2.d();
            } else {
                uri = null;
            }
            return new aexm(f, uri, null, new kdg(this, mxrVar, 7, null));
        }
        if (myzVar != null && myzVar.f) {
            MessageId b = kdlVar.a.b();
            aexh f2 = f(mxrVar);
            myn mynVar3 = mxrVar.b;
            if (mynVar3 != null) {
                uri2 = mynVar3.d();
            }
            return new aexj(f2, uri2, new jfq(this, b, mxrVar, 20, (short[]) null));
        }
        MessageId b2 = kdlVar.a.b();
        aexh f3 = f(mxrVar);
        myn mynVar4 = mxrVar.b;
        if (mynVar4 != null) {
            uri2 = mynVar4.d();
        }
        return new aexi(f3, uri2, Formatter.formatShortFileSize(this.b, mxrVar.a.longValue()), new jfq(this, b2, mxrVar, 19, (short[]) null));
    }

    private static final aexh f(mxr mxrVar) {
        if (gh.z(((mxq) mxrVar.c).a)) {
            return aexh.b;
        }
        return aexh.a;
    }

    public final qkg a(arwe arweVar, kdl kdlVar) {
        mxr mxrVar;
        asai aghwVar;
        myz myzVar;
        ncq ncqVar;
        asai a2;
        myo myoVar = kdlVar.b;
        mxr mxrVar2 = null;
        aexv c = c(kdlVar, null);
        myd a3 = myoVar.a();
        if (a3 != null) {
            mxrVar = a3.a();
        } else {
            mxrVar = null;
        }
        if (true == (mxrVar instanceof mxr)) {
            mxrVar2 = mxrVar;
        }
        if (mxrVar2 != null && (myzVar = ((mxq) mxrVar2.c).e) != null && (ncqVar = myzVar.a) != null && (a2 = lga.at(ncqVar, arweVar).a()) != null) {
            aghwVar = new jdn(a2, this, kdlVar, 7, null);
        } else {
            aghwVar = new aghw(c, 9);
        }
        int i = ascp.a;
        return qkq.j(arrn.T(aghwVar, arweVar, asco.a, c));
    }

    public final void b(loq loqVar) {
        afsx H = afwv.H(loqVar.a);
        if (H == null) {
            return;
        }
        this.m.u(new jgw(H, loqVar.b, null, afco.a));
        alvw g = a.g();
        g.X(alwp.a, "BugleRbmRichCard");
        ((alvg) g.h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/richcards/RichCardBubbleUiAdapter", "processMediaViewerResult", 374, "RichCardBubbleUiAdapter.kt")).D("Draft attachment added with uri: %s media type: %s", loqVar.b, loqVar.a);
    }

    public final aexv c(kdl kdlVar, myx myxVar) {
        aexv aexuVar;
        String str;
        String str2;
        int i;
        Uri uri;
        String str3;
        String str4;
        aexf aexfVar;
        String str5;
        String str6;
        mxr mxrVar;
        Uri uri2;
        String str7;
        String str8;
        aexe aexeVar;
        int i2;
        myo myoVar = kdlVar.b;
        if (myoVar instanceof mxo) {
            myr c = myoVar.c();
            if (c != null) {
                str5 = ((mxu) c).a;
            } else {
                str5 = null;
            }
            myr b = myoVar.b();
            if (b != null) {
                str6 = ((mxu) b).a;
            } else {
                str6 = null;
            }
            mxn mxnVar = ((mxo) myoVar).a;
            if (mxnVar != null) {
                mxrVar = mxnVar.a;
            } else {
                mxrVar = null;
            }
            if (true != (mxrVar instanceof mxr)) {
                mxrVar = null;
            }
            if (mxrVar == null) {
                str7 = str5;
                str8 = str6;
                aexeVar = null;
            } else if (myxVar == null) {
                aexeVar = new aexe(e(kdlVar, mxrVar));
                str7 = str5;
                str8 = str6;
            } else {
                aexh f = f(mxrVar);
                myn mynVar = mxrVar.b;
                if (mynVar != null) {
                    uri2 = mynVar.d();
                } else {
                    uri2 = null;
                }
                str7 = str5;
                str8 = str6;
                aexeVar = new aexe(new aexm(f, uri2, Float.valueOf(((float) myxVar.a) / ((float) myxVar.b)), new kdg(this, mxrVar, 8, null)));
            }
            List d = d(myoVar.d());
            if (r7.b - 1 != 0) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            aexuVar = new aext(str7, str8, aexeVar, d, i2, kdlVar.c, aewh.k, kdlVar.d);
        } else if (myoVar instanceof myc) {
            myr c2 = myoVar.c();
            if (c2 != null) {
                str = ((mxu) c2).a;
            } else {
                str = null;
            }
            myr b2 = myoVar.b();
            if (b2 != null) {
                str2 = ((mxu) b2).a;
            } else {
                str2 = null;
            }
            myb mybVar = ((myc) myoVar).a;
            if (true != (mybVar instanceof myb)) {
                mybVar = null;
            }
            if (mybVar == null) {
                str3 = str;
                str4 = str2;
                aexfVar = null;
            } else {
                int i3 = mybVar.b - 1;
                if (i3 != 0) {
                    if (i3 != 1) {
                        i = 264;
                    } else {
                        i = 168;
                    }
                } else {
                    i = 112;
                }
                mxr mxrVar2 = mybVar.a;
                if (myxVar == null) {
                    aexfVar = new aexf(e(kdlVar, mxrVar2), i);
                    str3 = str;
                    str4 = str2;
                } else {
                    aexh f2 = f(mxrVar2);
                    myn mynVar2 = mxrVar2.b;
                    if (mynVar2 != null) {
                        uri = mynVar2.d();
                    } else {
                        uri = null;
                    }
                    str3 = str;
                    str4 = str2;
                    aexfVar = new aexf(new aexm(f2, uri, Float.valueOf(((float) myxVar.a) / ((float) myxVar.b)), new kdg(this, mxrVar2, 9, null)), i);
                }
            }
            aexuVar = new aexu(str3, str4, aexfVar, d(myoVar.d()), kdlVar.c, aewh.m, kdlVar.d);
        } else {
            throw new armm();
        }
        return aexuVar;
    }
}
