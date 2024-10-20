package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData;
import com.google.android.ims.message.rbm.RbmSuggestionResponse;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionResponseSerializer;
import j$.util.Optional;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class qdq {
    public final /* synthetic */ Object a;

    public qdq() {
        throw null;
    }

    public final /* bridge */ /* synthetic */ int A(Object obj) {
        return ((kvw) this.a).k().G((String) obj);
    }

    public final String B(int i) {
        return ((kvw) this.a).k().K(i);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, arpe] */
    public final void C(List list) {
        Object obj = null;
        this.a.w(new fzx(list, obj, obj));
    }

    public final asqe D(akic akicVar, arqr arqrVar, Executor executor, Map map, arqv arqvVar, arqr arqrVar2, ancs ancsVar, arqg arqgVar) {
        return new asqe((Context) ((kru) this.a).a.n.b(), (qdq) ((kru) this.a).a.bp.b(), (Map) ((kru) this.a).a.bq.b(), (asqc) ((kru) this.a).a.aQ.b(), (anen) ((kru) this.a).a.ay.b(), (agcp) ((kru) this.a).a.aT.b(), (algw) ((kru) this.a).a.br.b(), (Map) ((kru) this.a).a.bt.b(), akicVar, arqrVar, executor, map, arqvVar, arqrVar2, ancsVar, arqgVar);
    }

    public final void E(int i, long j) {
        Object obj = this.a;
        boolean z = true;
        if (i != 20529) {
            if (i != 20530) {
                switch (i) {
                    case 131:
                        ((fpk) obj).b(i).d = (int) j;
                        return;
                    case 136:
                        if (j != 1) {
                            z = false;
                        }
                        ((fpk) obj).b(i).W = z;
                        return;
                    case 155:
                        fpk fpkVar = (fpk) obj;
                        fpkVar.r = fpkVar.a(j);
                        return;
                    case 159:
                        ((fpk) obj).b(i).P = (int) j;
                        return;
                    case 176:
                        ((fpk) obj).b(i).m = (int) j;
                        return;
                    case 179:
                        fpk fpkVar2 = (fpk) obj;
                        fpkVar2.c(i);
                        fpkVar2.w.t(fpkVar2.a(j));
                        return;
                    case 186:
                        ((fpk) obj).b(i).n = (int) j;
                        return;
                    case 215:
                        ((fpk) obj).b(i).c = (int) j;
                        return;
                    case 231:
                        fpk fpkVar3 = (fpk) obj;
                        fpkVar3.p = fpkVar3.a(j);
                        return;
                    case 238:
                        ((fpk) obj).s = (int) j;
                        return;
                    case 241:
                        fpk fpkVar4 = (fpk) obj;
                        if (!fpkVar4.q) {
                            fpkVar4.c(i);
                            fpkVar4.x.t(j);
                            fpkVar4.q = true;
                            return;
                        }
                        return;
                    case 251:
                        ((fpk) obj).t = true;
                        return;
                    case 16871:
                        ((fpk) obj).b(i).g = (int) j;
                        return;
                    case 16980:
                        if (j != 3) {
                            throw new erm(a.cn(j, "ContentCompAlgo ", " not supported"), null, true, 1);
                        }
                        return;
                    case 17029:
                        if (j < 1 || j > 2) {
                            throw new erm(a.cn(j, "DocTypeReadVersion ", " not supported"), null, true, 1);
                        }
                        return;
                    case 17143:
                        if (j != 1) {
                            throw new erm(a.cn(j, "EBMLReadVersion ", " not supported"), null, true, 1);
                        }
                        return;
                    case 18401:
                        if (j != 5) {
                            throw new erm(a.cn(j, "ContentEncAlgo ", " not supported"), null, true, 1);
                        }
                        return;
                    case 18408:
                        if (j != 1) {
                            throw new erm(a.cn(j, "AESSettingsCipherMode ", " not supported"), null, true, 1);
                        }
                        return;
                    case 21420:
                        fpk fpkVar5 = (fpk) obj;
                        fpkVar5.m = j + fpkVar5.f;
                        return;
                    case 21432:
                        int i2 = (int) j;
                        fpk fpkVar6 = (fpk) obj;
                        fpkVar6.j(i);
                        if (i2 != 0) {
                            if (i2 != 1) {
                                if (i2 != 3) {
                                    if (i2 == 15) {
                                        fpkVar6.j.x = 3;
                                        return;
                                    }
                                    return;
                                }
                                fpkVar6.j.x = 1;
                                return;
                            }
                            fpkVar6.j.x = 2;
                            return;
                        }
                        fpkVar6.j.x = 0;
                        return;
                    case 21680:
                        ((fpk) obj).b(i).p = (int) j;
                        return;
                    case 21682:
                        ((fpk) obj).b(i).r = (int) j;
                        return;
                    case 21690:
                        ((fpk) obj).b(i).q = (int) j;
                        return;
                    case 21930:
                        if (j != 1) {
                            z = false;
                        }
                        ((fpk) obj).b(i).V = z;
                        return;
                    case 21938:
                        fpk fpkVar7 = (fpk) obj;
                        fpkVar7.j(i);
                        fpj fpjVar = fpkVar7.j;
                        fpjVar.y = true;
                        fpjVar.o = (int) j;
                        return;
                    case 21998:
                        ((fpk) obj).b(i).f = (int) j;
                        return;
                    case 22186:
                        ((fpk) obj).b(i).S = j;
                        return;
                    case 22203:
                        ((fpk) obj).b(i).T = j;
                        return;
                    case 25188:
                        ((fpk) obj).b(i).Q = (int) j;
                        return;
                    case 30114:
                        ((fpk) obj).u = j;
                        return;
                    case 30321:
                        int i3 = (int) j;
                        fpk fpkVar8 = (fpk) obj;
                        fpkVar8.j(i);
                        if (i3 != 0) {
                            if (i3 != 1) {
                                if (i3 != 2) {
                                    if (i3 == 3) {
                                        fpkVar8.j.s = 3;
                                        return;
                                    }
                                    return;
                                }
                                fpkVar8.j.s = 2;
                                return;
                            }
                            fpkVar8.j.s = 1;
                            return;
                        }
                        fpkVar8.j.s = 0;
                        return;
                    case 2352003:
                        ((fpk) obj).b(i).e = (int) j;
                        return;
                    case 2807729:
                        ((fpk) obj).g = j;
                        return;
                    default:
                        switch (i) {
                            case 21945:
                                int i4 = (int) j;
                                fpk fpkVar9 = (fpk) obj;
                                fpkVar9.j(i);
                                if (i4 != 1) {
                                    if (i4 == 2) {
                                        fpkVar9.j.B = 1;
                                        return;
                                    }
                                    return;
                                }
                                fpkVar9.j.B = 2;
                                return;
                            case 21946:
                                fpk fpkVar10 = (fpk) obj;
                                fpkVar10.j(i);
                                int b = eqd.b((int) j);
                                if (b != -1) {
                                    fpkVar10.j.A = b;
                                    return;
                                }
                                return;
                            case 21947:
                                fpk fpkVar11 = (fpk) obj;
                                fpkVar11.j(i);
                                fpkVar11.j.y = true;
                                int a = eqd.a((int) j);
                                if (a != -1) {
                                    fpkVar11.j.z = a;
                                    return;
                                }
                                return;
                            case 21948:
                                ((fpk) obj).b(i).C = (int) j;
                                return;
                            case 21949:
                                ((fpk) obj).b(i).D = (int) j;
                                return;
                            default:
                                return;
                        }
                }
            }
            if (j != 1) {
                throw new erm(a.cn(j, "ContentEncodingScope ", " not supported"), null, true, 1);
            }
            return;
        }
        if (j == 0) {
        } else {
            throw new erm(a.cn(j, "ContentEncodingOrder ", " not supported"), null, true, 1);
        }
    }

    public final void F(int i, long j, long j2) {
        fpk fpkVar = (fpk) this.a;
        fpkVar.k();
        if (i != 160) {
            if (i != 174) {
                if (i != 187) {
                    if (i != 19899) {
                        if (i != 20533) {
                            if (i != 21968) {
                                if (i != 408125543) {
                                    if (i != 475249515) {
                                        if (i == 524531317 && !fpkVar.k) {
                                            if (fpkVar.d && fpkVar.o != -1) {
                                                fpkVar.n = true;
                                                return;
                                            } else {
                                                fpkVar.v.w(new fmj(fpkVar.i));
                                                fpkVar.k = true;
                                                return;
                                            }
                                        }
                                        return;
                                    }
                                    fpkVar.w = new atkv(null, null, null);
                                    fpkVar.x = new atkv(null, null, null);
                                    return;
                                }
                                long j3 = fpkVar.f;
                                if (j3 != -1 && j3 != j) {
                                    throw new erm("Multiple Segment elements not supported", null, true, 1);
                                }
                                fpkVar.f = j;
                                fpkVar.e = j2;
                                return;
                            }
                            fpkVar.b(i).y = true;
                            return;
                        }
                        fpkVar.b(i).h = true;
                        return;
                    }
                    fpkVar.l = -1;
                    fpkVar.m = -1L;
                    return;
                }
                fpkVar.q = false;
                return;
            }
            fpkVar.j = new fpj();
            return;
        }
        fpkVar.t = false;
        fpkVar.u = 0L;
    }

    public final void G(int i) {
        ((fjm) this.a).f(i);
    }

    public final void H(Exception exc) {
        eub.d("MediaCodecAudioRenderer", "Audio sink error", exc);
        fdx fdxVar = ((fcz) this.a).l;
        Object obj = fdxVar.a;
        if (obj != null) {
            ((Handler) obj).post(new exl(fdxVar, 12));
        }
    }

    public final void I(fag fagVar) {
        Object obj = this.a;
        ((fad) obj).d.b(new ewq(obj, fagVar, 11));
    }

    public final void J() {
        eyk eykVar = (eyk) this.a;
        eykVar.m = true;
        if (eykVar.h.isEmpty()) {
            esk eskVar = eykVar.j;
            dzg.g(eskVar);
            eskVar.f();
            return;
        }
        eykVar.b();
    }

    public final void K(Throwable th) {
        ((ejx) ((ekq) this.a).c).e(th);
    }

    public final float L(float f) {
        return ((dvo) this.a).j.ec() * f;
    }

    public final dtz M() {
        return ((duc) this.a).a();
    }

    public final dtz N() {
        return ((duc) this.a).a();
    }

    public final oo O(int i) {
        oo i2 = ((RecyclerView) this.a).i(i, true);
        if (i2 == null || ((RecyclerView) this.a).g.k(i2.a)) {
            return null;
        }
        return i2;
    }

    public final void P(kg kgVar) {
        int i = kgVar.a;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i != 8) {
                        return;
                    }
                    ((RecyclerView) this.a).m.z(kgVar.b, kgVar.d);
                    return;
                } else {
                    nw nwVar = ((RecyclerView) this.a).m;
                    int i2 = kgVar.b;
                    int i3 = kgVar.d;
                    Object obj = kgVar.c;
                    nwVar.B(i2, i3);
                    return;
                }
            }
            ((RecyclerView) this.a).m.A(kgVar.b, kgVar.d);
            return;
        }
        ((RecyclerView) this.a).m.x(kgVar.b, kgVar.d);
    }

    public final void Q(int i, int i2, Object obj) {
        int i3;
        int i4;
        int i5;
        RecyclerView recyclerView = (RecyclerView) this.a;
        int b = recyclerView.g.b();
        int i6 = 0;
        while (true) {
            i3 = i + i2;
            if (i6 >= b) {
                break;
            }
            View e = recyclerView.g.e(i6);
            oo k = RecyclerView.k(e);
            if (k != null && !k.A() && (i5 = k.c) >= i && i5 < i3) {
                k.f(2);
                k.e(obj);
                ((nx) e.getLayoutParams()).e = true;
            }
            i6++;
        }
        od odVar = recyclerView.e;
        int size = odVar.c.size();
        while (true) {
            size--;
            if (size >= 0) {
                oo ooVar = (oo) odVar.c.get(size);
                if (ooVar != null && (i4 = ooVar.c) >= i && i4 < i3) {
                    ooVar.f(2);
                    odVar.k(size);
                }
            } else {
                ((RecyclerView) this.a).O = true;
                return;
            }
        }
    }

    public final void R(int i, int i2) {
        RecyclerView recyclerView = (RecyclerView) this.a;
        int b = recyclerView.g.b();
        for (int i3 = 0; i3 < b; i3++) {
            oo k = RecyclerView.k(recyclerView.g.e(i3));
            if (k != null && !k.A() && k.c >= i) {
                k.k(i2, false);
                recyclerView.M.f = true;
            }
        }
        od odVar = recyclerView.e;
        int size = odVar.c.size();
        for (int i4 = 0; i4 < size; i4++) {
            oo ooVar = (oo) odVar.c.get(i4);
            if (ooVar != null && ooVar.c >= i) {
                ooVar.k(i2, false);
            }
        }
        recyclerView.requestLayout();
        ((RecyclerView) this.a).N = true;
    }

    public final void S(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        RecyclerView recyclerView = (RecyclerView) this.a;
        int b = recyclerView.g.b();
        int i9 = 0;
        while (true) {
            int i10 = -1;
            if (i9 >= b) {
                break;
            }
            oo k = RecyclerView.k(recyclerView.g.e(i9));
            if (k != null) {
                if (i < i2) {
                    i7 = i;
                } else {
                    i7 = i2;
                }
                int i11 = k.c;
                if (i11 >= i7) {
                    if (i < i2) {
                        i8 = i2;
                    } else {
                        i8 = i;
                    }
                    if (i11 <= i8) {
                        if (i11 == i) {
                            k.k(i2 - i, false);
                        } else {
                            if (i >= i2) {
                                i10 = 1;
                            }
                            k.k(i10, false);
                        }
                        recyclerView.M.f = true;
                    }
                }
            }
            i9++;
        }
        od odVar = recyclerView.e;
        if (i < i2) {
            i3 = i2;
        } else {
            i3 = i;
        }
        if (i < i2) {
            i4 = i;
        } else {
            i4 = i2;
        }
        int size = odVar.c.size();
        for (int i12 = 0; i12 < size; i12++) {
            oo ooVar = (oo) odVar.c.get(i12);
            if (ooVar != null && (i5 = ooVar.c) >= i4 && i5 <= i3) {
                if (i5 == i) {
                    ooVar.k(i2 - i, false);
                } else {
                    if (i < i2) {
                        i6 = -1;
                    } else {
                        i6 = 1;
                    }
                    ooVar.k(i6, false);
                }
            }
        }
        recyclerView.requestLayout();
        ((RecyclerView) this.a).N = true;
    }

    public final void T(int i, int i2) {
        ((RecyclerView) this.a).S(i, i2, true);
        RecyclerView recyclerView = (RecyclerView) this.a;
        recyclerView.N = true;
        recyclerView.M.c += i2;
    }

    public final int U() {
        return ((RecyclerView) this.a).getChildCount();
    }

    public final int V(View view) {
        return ((RecyclerView) this.a).indexOfChild(view);
    }

    public final View W(int i) {
        return ((RecyclerView) this.a).getChildAt(i);
    }

    public final void X(View view) {
        oo k = RecyclerView.k(view);
        if (k != null) {
            ((RecyclerView) this.a).aE(k, k.o);
            k.o = 0;
        }
    }

    public final void Y(int i) {
        View childAt = ((RecyclerView) this.a).getChildAt(i);
        if (childAt != null) {
            ((RecyclerView) this.a).fg(childAt);
            childAt.clearAnimation();
        }
        ((RecyclerView) this.a).removeViewAt(i);
    }

    public final void Z(oo ooVar, ns nsVar, ns nsVar2) {
        ooVar.n(false);
        RecyclerView recyclerView = (RecyclerView) this.a;
        if (recyclerView.C.j(ooVar, nsVar, nsVar2)) {
            recyclerView.X();
        }
    }

    public final void a(pwh pwhVar) {
        ((dtq) this.a).b(pwhVar);
    }

    public final void aa(oo ooVar, ns nsVar, ns nsVar2) {
        ((RecyclerView) this.a).e.o(ooVar);
        RecyclerView recyclerView = (RecyclerView) this.a;
        recyclerView.gh(ooVar);
        ooVar.n(false);
        if (recyclerView.C.l(ooVar, nsVar, nsVar2)) {
            recyclerView.X();
        }
    }

    public final void ab(oo ooVar) {
        RecyclerView recyclerView = (RecyclerView) this.a;
        recyclerView.m.aZ(ooVar.a, recyclerView.e);
    }

    public final void b(pwr pwrVar) {
        pwj pwjVar = new pwj(pwrVar);
        pwz pwzVar = ((pww) this.a).a;
        pwzVar.a(pwzVar.h, pwjVar);
    }

    public final int c() {
        return ((aqby) this.a).h;
    }

    public final int d() {
        return ((aqby) this.a).g;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0011. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00bb  */
    /* JADX WARN: Type inference failed for: r0v0, types: [aqbz, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.myq e() {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qdq.e():myq");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aqbz, java.lang.Object] */
    public final String f() {
        aqbx f = aqam.f(this.a);
        if (f != null) {
            return f.b;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aqbz, java.lang.Object] */
    public final String g() {
        aqbu aqbuVar;
        aqbw aqbwVar;
        ?? r0 = this.a;
        if (aqam.e(r0) != null) {
            aqby aqbyVar = (aqby) r0;
            if (aqbyVar.b == 8) {
                aqbwVar = (aqbw) aqbyVar.c;
            } else {
                aqbwVar = aqbw.a;
            }
            return aqbwVar.b;
        }
        if (aqam.d(r0) != null) {
            aqby aqbyVar2 = (aqby) r0;
            if (aqbyVar2.b == 21) {
                aqbuVar = (aqbu) aqbyVar2.c;
            } else {
                aqbuVar = aqbu.a;
            }
            return aqbuVar.b;
        }
        return null;
    }

    public final jsa h(armf armfVar) {
        Context context = (Context) ((ksb) this.a).a.n.b();
        arpi arpiVar = (arpi) ((ksb) this.a).a.dN.b();
        arwe arweVar = (arwe) ((ksb) this.a).a.dO.b();
        arwe arweVar2 = (arwe) ((ksb) this.a).c.c.b();
        aksr aksrVar = (aksr) ((ksb) this.a).b.d.b();
        kqt kqtVar = ((ksb) this.a).c;
        akip eN = kqtVar.eN();
        jxv jxvVar = (jxv) kqtVar.g.b();
        joz jozVar = (joz) ((ksb) this.a).c.q.b();
        ascg ascgVar = (ascg) ((ksb) this.a).c.j.b();
        kqt kqtVar2 = ((ksb) this.a).c;
        Optional empty = Optional.empty();
        ((mgu) kqtVar2.a.tV.b()).getClass();
        ksb ksbVar = (ksb) this.a;
        kqt kqtVar3 = ksbVar.c;
        krv krvVar = ksbVar.a;
        Optional empty2 = Optional.empty();
        apya apyaVar = krvVar.dq;
        apya apyaVar2 = krvVar.jo;
        asai asaiVar = (asai) kqtVar3.f.b();
        ksb ksbVar2 = (ksb) this.a;
        jgk a = ksbVar2.c.a();
        krx krxVar = ksbVar2.a.a;
        return new jsa(context, arpiVar, arweVar, arweVar2, aksrVar, eN, jxvVar, jozVar, ascgVar, empty, empty2, apyaVar, apyaVar2, asaiVar, a, krxVar.V(), new pmr(krxVar.a.bN), armfVar);
    }

    public final jkg i(amqe amqeVar) {
        jkk jkkVar = (jkk) ((ksb) this.a).c.p.b();
        qdq qdqVar = (qdq) ((ksb) this.a).c.r.b();
        jxv jxvVar = (jxv) ((ksb) this.a).c.g.b();
        Context context = (Context) ((ksb) this.a).a.n.b();
        ksb ksbVar = (ksb) this.a;
        return new jkg(jkkVar, qdqVar, jxvVar, context, ksbVar.c.d, (adwo) ksbVar.a.a.fi.b(), amqeVar);
    }

    public final kam j(miz mizVar, miz mizVar2, miz mizVar3) {
        ksb ksbVar = (ksb) this.a;
        return new kam(mizVar, mizVar2, mizVar3, ksbVar.c.eL(), (xnv) ksbVar.a.bV.b());
    }

    public final jsm k(jhn jhnVar) {
        arwe arweVar = (arwe) ((ksb) this.a).a.dO.b();
        arpi arpiVar = (arpi) ((ksb) this.a).a.dN.b();
        arwe arweVar2 = (arwe) ((ksb) this.a).c.c.b();
        kqt kqtVar = ((ksb) this.a).c;
        jsr jsrVar = new jsr((ascg) kqtVar.j.b(), kqtVar.ex());
        kqt kqtVar2 = ((ksb) this.a).c;
        jsp jspVar = new jsp((arwe) kqtVar2.c.b(), (kkc) kqtVar2.k.b(), (yyb) kqtVar2.a.lC.b(), (xnv) kqtVar2.a.bV.b(), kqtVar2.eK(), kqtVar2.ex(), kqtVar2.a.mk);
        kkc kkcVar = (kkc) ((ksb) this.a).c.k.b();
        yyb yybVar = (yyb) ((ksb) this.a).a.lC.b();
        ksb ksbVar = (ksb) this.a;
        kqt kqtVar3 = ksbVar.c;
        joo b = ksbVar.b.b();
        jat ex = kqtVar3.ex();
        krv krvVar = kqtVar3.a;
        apya apyaVar = krvVar.kN;
        arwe arweVar3 = (arwe) krvVar.dO.b();
        arpi arpiVar2 = (arpi) kqtVar3.a.dN.b();
        lfx lfxVar = (lfx) kqtVar3.h.b();
        mja mjaVar = (mja) kqtVar3.l.b();
        asai asaiVar = (asai) kqtVar3.e.b();
        ConversationId conversationId = (ConversationId) kqtVar3.b.b();
        asai asaiVar2 = (asai) kqtVar3.f.b();
        hgi hgiVar = new hgi(kqtVar3.a.a.eZ, (short[]) null);
        krv krvVar2 = kqtVar3.a;
        krx krxVar = krvVar2.a;
        oui ouiVar = new oui(krxVar.a.bN);
        krx krxVar2 = kqtVar3.a.a;
        apya apyaVar2 = krvVar2.tz;
        jnl h = krxVar.h();
        afsp l = jfx.l();
        hgi hgiVar2 = (hgi) krxVar2.ds.b();
        jgt jgtVar = (jgt) kqtVar3.a.a.fb.b();
        krv krvVar3 = kqtVar3.a;
        krx krxVar3 = krvVar3.a;
        jrr jrrVar = new jrr(apyaVar, arweVar3, arpiVar2, lfxVar, mjaVar, asaiVar, conversationId, asaiVar2, hgiVar, ouiVar, apyaVar2, h, l, hgiVar2, jgtVar, krvVar3.cj, krxVar3.fc, krxVar3.fd);
        kqt kqtVar4 = ((ksb) this.a).c;
        return new jsm(arweVar, arpiVar, arweVar2, jsrVar, jspVar, kkcVar, yybVar, b, ex, jrrVar, new jsb(kqtVar4.m, kqtVar4.n), ((ksb) this.a).c.eN(), jhnVar);
    }

    public final puk l(puu puuVar) {
        return new puk(puuVar, (qxr) ((kru) this.a).a.hR.b(), (arwe) ((kru) this.a).a.dO.b());
    }

    public final aogy m(ankt anktVar, anil anilVar) {
        anio anioVar = (anio) ((kru) this.a).a.ia.b();
        krv krvVar = ((kru) this.a).a;
        return new aogy(anioVar, anktVar, anilVar, krvVar.fA(), krvVar.Us(), new xdj());
    }

    public final puv n(puu puuVar, puu puuVar2) {
        return new puv(puuVar, puuVar2, (anen) ((kru) this.a).a.m.b());
    }

    public final kzp o(ncq ncqVar, ncq ncqVar2) {
        return new kzp((arwe) ((kru) this.a).a.bQ.b(), ncqVar, ncqVar2, 2);
    }

    public final mlk p(ncq ncqVar, ncq ncqVar2, ncq ncqVar3, BugleConversationId bugleConversationId) {
        return new mlk((arwe) ((kru) this.a).a.bQ.b(), ncqVar, ncqVar2, ncqVar3, bugleConversationId);
    }

    public final vfd q(String str, Iterable iterable) {
        krv krvVar = ((kru) this.a).a;
        return new vfd(krvVar.cF, (nib) krvVar.mc.b(), str, iterable);
    }

    public final xga r(ankl anklVar) {
        return new xga((arwe) ((kru) this.a).a.dO.b(), anklVar);
    }

    public final pye s(pxp pxpVar) {
        Context context = (Context) ((kru) this.a).a.n.b();
        anen anenVar = (anen) ((kru) this.a).a.z.b();
        anen anenVar2 = (anen) ((kru) this.a).a.m.b();
        krv krvVar = ((kru) this.a).a;
        apya apyaVar = krvVar.qe;
        apya apyaVar2 = krvVar.qs;
        hgj hgjVar = new hgj(krvVar.m, (char[]) null, (byte[]) null);
        krv krvVar2 = ((kru) this.a).a;
        return new pye(context, anenVar, anenVar2, apyaVar, apyaVar2, hgjVar, krvVar2.aD(), krvVar2.mu, pxpVar);
    }

    public final /* bridge */ /* synthetic */ anil t(qei qeiVar) {
        return new xdf(qeiVar, (qdq) ((kru) this.a).a.ik.b());
    }

    public final void u(jgx jgxVar) {
        jlw jlwVar = (jlw) this.a;
        qjh.l(jlwVar.e, null, new jec(jlwVar, jgxVar, (arpe) null, 6), 3);
    }

    public final cg v() {
        return ((ixd) this.a).M;
    }

    public final cj w() {
        return ((ixd) this.a).M.F();
    }

    public final rrl x() {
        return (rrl) ((ixd) this.a).ca.a();
    }

    public final void y(SuggestionData suggestionData) {
        boolean z = suggestionData instanceof SmartSuggestionData;
        Object obj = this.a;
        int i = 1;
        if (z && suggestionData.e()) {
            alvw g = ixd.a.g();
            g.X(alwp.a, "Bugle");
            alvg alvgVar = (alvg) g;
            ixd ixdVar = (ixd) obj;
            alvgVar.X(ydl.p, ixdVar.L);
            ((alvg) alvgVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "sendSuggestionResponse", 6649, "ConversationFragmentPeer.java")).t("ConversationFragment: Sending p2p suggestion response for P2pSuggestion{%s}", new ivm(suggestionData, i));
            ixdVar.av(suggestionData.d(), "text/plain");
            return;
        }
        int i2 = 0;
        if (suggestionData instanceof RbmSuggestionData) {
            alvw g2 = ixd.a.g();
            g2.X(alwp.a, "Bugle");
            alvg alvgVar2 = (alvg) g2;
            ixd ixdVar2 = (ixd) obj;
            alvgVar2.X(ydl.p, ixdVar2.L);
            ((alvg) alvgVar2.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "sendSuggestionResponse", 6657, "ConversationFragmentPeer.java")).t("ConversationFragment: Sending rbm suggestion response for conversationSuggestion{%s}", new ivm(suggestionData, i2));
            String serializeToJson = ConversationSuggestionResponseSerializer.serializeToJson(((RbmSuggestionData) suggestionData).b);
            if (serializeToJson != null) {
                ixdVar2.av(serializeToJson, RbmSuggestionResponse.CONTENT_TYPE);
                return;
            }
            throw new IllegalStateException(String.format("Suggestion serialization failed %s", yyb.bh(suggestionData.toString())));
        }
        throw new IllegalStateException(String.format("Cannot determine how to handle conversation suggestion %s", yyb.bh(suggestionData.toString())));
    }

    public final void z() {
        int i = 20;
        ((ixd) this.a).Q(new ivn(i), new ivp(this, i));
    }

    public /* synthetic */ qdq(Object obj) {
        this.a = obj;
    }

    public qdq(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public qdq(Activity activity, gqg gqgVar, mci mciVar, arpi arpiVar, zkm zkmVar, aajt aajtVar, Context context, arpi arpiVar2, arwe arweVar, abac abacVar, aant aantVar, arqg arqgVar, Supplier supplier) {
        this.a = gqgVar.a(amqh.CONTACT, new sj(), ipf.f, new iqa(activity, mciVar, arpiVar, zkmVar, aajtVar, context, arqgVar, arpiVar2, supplier, abacVar, aantVar, arweVar));
    }

    public qdq(Activity activity, gqg gqgVar, Optional optional, arqg arqgVar, Supplier supplier) {
        this.a = gqgVar.a(amqh.LOCATION, new sl(), new bp(activity, optional, supplier, 14, null), new iqg(activity, arqgVar));
    }

    public qdq(kvw kvwVar) {
        this.a = kvwVar;
        d.s(true);
    }
}
