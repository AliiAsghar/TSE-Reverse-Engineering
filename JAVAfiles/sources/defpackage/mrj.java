package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateAttachmentAfterResizingAction;
import j$.util.Optional;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mrj implements alhr {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ mrj(UpdateAttachmentAfterResizingAction updateAttachmentAfterResizingAction, String str, String str2, tql tqlVar, String str3, int i) {
        this.f = i;
        this.a = updateAttachmentAfterResizingAction;
        this.c = str;
        this.d = str2;
        this.b = tqlVar;
        this.e = str3;
    }

    /* JADX WARN: Type inference failed for: r10v4, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, ncq] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, ncq] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, mjg] */
    /* JADX WARN: Type inference failed for: r1v1, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v106, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v142, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v154, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v157, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v166, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v178, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v191, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v214, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v221, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v24, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v258, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v41, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v77, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v88, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v109, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v145, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v167, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v169, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v47, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v91, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v92, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v45, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v46, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v65, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v18, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v19, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v21, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v16, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v23, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v11, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [armf, java.lang.Object] */
    @Override // defpackage.alhr
    public final Object get() {
        Optional c;
        Optional c2;
        anhl anhlVar;
        int i = 7;
        byte[] bArr = null;
        switch (this.f) {
            case 0:
                ?? r1 = this.b;
                int ordinal = ((msy) r1.get()).ordinal();
                ?? r3 = this.c;
                Object obj = this.a;
                switch (ordinal) {
                    case 0:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 7:
                    case 9:
                    case 11:
                    case 12:
                    case 13:
                    case 15:
                        return (String) r3.get();
                    case 1:
                    case 10:
                        return (String) this.e.get();
                    case 6:
                    case 14:
                        return (String) ((msx) ((mrk) obj).e.b()).b((String) r3.get()).orElse((String) r3.get());
                    case 8:
                        mrk mrkVar = (mrk) obj;
                        return (String) mrkVar.o((String) ((msx) mrkVar.e.b()).b((String) r3.get()).orElse((String) r3.get()), (String) this.d.get(), false).get();
                    default:
                        throw new IllegalStateException("Unknown destination format: ".concat(String.valueOf(((msy) r1.get()).name())));
                }
            case 1:
                ?? r12 = this.b;
                int ordinal2 = ((msy) r12.get()).ordinal();
                ?? r32 = this.c;
                Object obj2 = this.a;
                switch (ordinal2) {
                    case 0:
                    case 2:
                    case 3:
                    case 4:
                    case 7:
                    case 11:
                    case 12:
                    case 15:
                        return Optional.empty();
                    case 1:
                    case 8:
                        return ((yjr) ((mrk) obj2).g.b()).c((String) r32.get());
                    case 5:
                    case 9:
                    case 10:
                    case 13:
                        Object obj3 = this.e;
                        return ((yjr) ((mrk) obj2).g.b()).c((String) this.d.get()).or(new mau(obj2, obj3, 6, null));
                    case 6:
                    case 14:
                        return ((msx) ((mrk) obj2).e.b()).a((String) r32.get());
                    default:
                        throw new IllegalStateException("Unknown destination format: ".concat(String.valueOf(((msy) r12.get()).name())));
                }
            case 2:
                ?? r13 = this.b;
                int ordinal3 = ((msy) r13.get()).ordinal();
                ?? r33 = this.d;
                ?? r4 = this.c;
                Object obj4 = this.a;
                switch (ordinal3) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        return (String) r4.get();
                    case 8:
                        if (((Boolean) msw.a.e()).booleanValue()) {
                            if (((Optional) r33.get()).isPresent() && !((yjt) ((Optional) r33.get()).get()).a()) {
                                c = ((yjr) ((mrk) obj4).g.b()).d((String) r4.get(), ((yjt) ((Optional) r33.get()).get()).toString());
                            } else {
                                c = ((yjr) ((mrk) obj4).g.b()).c((String) r4.get());
                            }
                            return mrp.c((String) r4.get(), c, true);
                        }
                        return (String) r4.get();
                    case 9:
                        if (((Boolean) msw.a.e()).booleanValue()) {
                            return mrp.c((String) r4.get(), (Optional) r33.get(), false);
                        }
                        return (String) r4.get();
                    case 10:
                        return (String) ((mrk) obj4).o((String) r4.get(), (String) this.e.get(), false).get();
                    default:
                        throw new IllegalStateException("Unknown destination format: ".concat(String.valueOf(((msy) r13.get()).name())));
                }
            case 3:
                ?? r14 = this.b;
                int ordinal4 = ((mrp) r14.get()).a.ordinal();
                Object obj5 = this.a;
                ?? r5 = this.c;
                switch (ordinal4) {
                    case 0:
                    case 2:
                    case 3:
                    case 4:
                    case 7:
                    case 11:
                    case 12:
                    case 15:
                        return Optional.empty();
                    case 1:
                    case 8:
                        return ((yjr) ((mrq) obj5).g.b()).c((String) r5.get());
                    case 5:
                    case 9:
                    case 10:
                    case 13:
                        Object obj6 = this.e;
                        return ((yjr) ((mrq) obj5).g.b()).c((String) this.d.get()).or(new mau(obj5, obj6, 7, null));
                    case 6:
                    case 14:
                        return ((msx) ((mrq) obj5).e.b()).a((String) r5.get());
                    default:
                        throw new IllegalStateException("Unknown destination format: ".concat(String.valueOf(((mrp) r14.get()).a.name())));
                }
            case 4:
                ?? r15 = this.b;
                int ordinal5 = ((mrp) r15.get()).a.ordinal();
                Object obj7 = this.a;
                ?? r42 = this.c;
                ?? r6 = this.d;
                switch (ordinal5) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        return (String) r42.get();
                    case 8:
                        if (((Boolean) msw.a.e()).booleanValue()) {
                            if (((Optional) r6.get()).isPresent() && !((yjt) ((Optional) r6.get()).get()).a()) {
                                c2 = ((yjr) ((mrq) obj7).g.b()).d((String) r42.get(), ((yjt) ((Optional) r6.get()).get()).toString());
                            } else {
                                c2 = ((yjr) ((mrq) obj7).g.b()).c((String) r42.get());
                            }
                            return mrp.c((String) r42.get(), c2, true);
                        }
                        return (String) r42.get();
                    case 9:
                        if (((Boolean) msw.a.e()).booleanValue()) {
                            return mrp.c((String) r42.get(), (Optional) r6.get(), false);
                        }
                        return (String) r42.get();
                    case 10:
                        return (String) ((mrq) obj7).n((String) r42.get(), (String) this.e.get(), false).get();
                    default:
                        throw new IllegalStateException("Unknown destination format: ".concat(String.valueOf(((mrp) r15.get()).a.name())));
                }
            case 5:
                ?? r16 = this.b;
                int ordinal6 = ((mrp) r16.get()).a.ordinal();
                Object obj8 = this.a;
                ?? r43 = this.c;
                switch (ordinal6) {
                    case 0:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 7:
                    case 9:
                    case 11:
                    case 12:
                    case 13:
                    case 15:
                        return (String) r43.get();
                    case 1:
                    case 10:
                        return (String) this.e.get();
                    case 6:
                    case 14:
                        return (String) ((msx) ((mrq) obj8).e.b()).b((String) r43.get()).orElse((String) r43.get());
                    case 8:
                        mrq mrqVar = (mrq) obj8;
                        return (String) mrqVar.n((String) ((msx) mrqVar.e.b()).b((String) r43.get()).orElse((String) r43.get()), (String) this.d.get(), false).get();
                    default:
                        throw new IllegalStateException("Unknown destination format: ".concat(String.valueOf(((mrp) r16.get()).a.name())));
                }
            case 6:
                ?? r17 = this.b;
                mru mruVar = (mru) r17.get();
                Object obj9 = this.e;
                if (mruVar != mru.BOT && mruVar != mru.PENPAL_BOT && mruVar != mru.EMAIL && mruVar != mru.UNKNOWN_SENDER && mruVar != mru.WAP_PUSH_SI && mruVar != mru.INVALID && mruVar != mru.SATELLITE_ESP) {
                    ?? r62 = this.c;
                    Object obj10 = this.a;
                    mrv mrvVar = (mrv) r62.get();
                    if (mrvVar == null) {
                        return ((mrw) obj10).x((String) obj9);
                    }
                    mrw mrwVar = (mrw) obj10;
                    yjr yjrVar = (yjr) mrwVar.b.b();
                    String m = ((yjr) mrwVar.b.b()).m();
                    if (mruVar == mru.ALPHA_CODE_OR_PHONEWORD) {
                        mrwVar.z();
                        int i2 = mrvVar.a;
                        if (i2 != 1 && i2 != 2) {
                            return mrwVar.x((String) obj9);
                        }
                        return new msf(((anhn) yjrVar.d.b()).f(mrvVar.b, m));
                    }
                    if (mrwVar.v(mrvVar)) {
                        return mrwVar.x(yjrVar.E(mrvVar.b, anhl.NATIONAL));
                    }
                    if (mruVar != mru.E164_LIKE && mruVar != mru.NATIONAL_OR_LOCAL) {
                        mrwVar.z();
                        throw new AssertionError("Unknown destination format: ".concat(String.valueOf(((mru) r17.get()).name())));
                    }
                    int i3 = mrvVar.a;
                    if (i3 != 1 && i3 != 2 && !mrwVar.u(mrvVar)) {
                        return mrwVar.x((String) this.d.get());
                    }
                    yjt yjtVar = new yjt(mrvVar.b.c());
                    yjt a = yjrVar.a(m);
                    if (!a.a() && yjtVar.equals(a)) {
                        anhlVar = anhl.NATIONAL;
                    } else {
                        anhlVar = anhl.INTERNATIONAL;
                    }
                    return mrwVar.x(yjrVar.E(mrvVar.b, anhlVar));
                }
                return new msf((String) obj9);
            case 7:
                Object obj11 = this.e;
                if (obj11 == null) {
                    return Optional.empty();
                }
                ?? r2 = this.b;
                switch (((mru) r2.get()).ordinal()) {
                    case 0:
                    case 1:
                    case 2:
                    case 10:
                        return Optional.of(obj11);
                    case 3:
                    case 4:
                    case 9:
                        return Optional.empty();
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        mrv mrvVar2 = (mrv) this.c.get();
                        if (mrvVar2 == null) {
                            return Optional.empty();
                        }
                        if (mrvVar2.a == 1) {
                            return Optional.of((String) this.d.get());
                        }
                        if (((yjr) ((mrw) this.a).b.b()).z((String) obj11)) {
                            return Optional.of(obj11);
                        }
                        return Optional.empty();
                    default:
                        throw new AssertionError("Unknown destination format: ".concat(String.valueOf(((mru) r2.get()).name())));
                }
            case 8:
                ?? r18 = this.d;
                Object obj12 = this.e;
                if (obj12 == null) {
                    return Optional.empty();
                }
                ?? r34 = this.b;
                Object obj13 = this.a;
                switch (((mru) r34.get()).ordinal()) {
                    case 0:
                        return Optional.of(((psq) ((mrw) obj13).d.b()).b((String) obj12));
                    case 1:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        if (((mrv) this.c.get()) == null) {
                            return Optional.empty();
                        }
                        try {
                            return Optional.of(((psq) ((mrw) obj13).d.b()).a((String) r18.get(), false));
                        } catch (psr unused) {
                            return Optional.empty();
                        }
                    case 2:
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                        return Optional.empty();
                    default:
                        throw new AssertionError("Unknown destination format: ".concat(String.valueOf(((mru) r34.get()).name())));
                }
            case 9:
                Object obj14 = ((mrn) this.b).a;
                if (obj14 == null) {
                    return "";
                }
                ?? r35 = this.c;
                switch (((mru) r35.get()).ordinal()) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                        return obj14;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        ?? r52 = this.e;
                        ?? r63 = this.d;
                        Object obj15 = this.a;
                        mrv mrvVar3 = (mrv) r63.get();
                        if (mrvVar3 == null) {
                            return (String) ((msx) ((mrw) obj15).a.b()).b((String) r52.get()).orElse(obj14);
                        }
                        if (!mrw.A(mrvVar3.b)) {
                            if (((Boolean) aczf.o().a.au.a()).booleanValue()) {
                                return ((Pattern) msx.a.get()).matcher(d.ap((String) obj14)).replaceAll("");
                            }
                            return r52.get();
                        }
                        int i4 = mrvVar3.a;
                        if (i4 != 2 && i4 != 4) {
                            if (r35.get() == mru.E164_LIKE) {
                                return ((anhn) ((mrw) obj15).c.b()).e(mrvVar3.b, anhl.E164);
                            }
                            return (String) ((msx) ((mrw) obj15).a.b()).b((String) r52.get()).orElse(r52.get());
                        }
                        return ((yjr) ((mrw) obj15).b.b()).F(mrvVar3.b);
                    default:
                        throw new AssertionError("Unknown destination format: ".concat(String.valueOf(((mru) r35.get()).name())));
                }
            case 10:
                Object obj16 = this.e;
                if (obj16 == null) {
                    return "";
                }
                ?? r22 = this.b;
                switch (((mru) r22.get()).ordinal()) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                        return obj16;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        ?? r19 = this.d;
                        mrv mrvVar4 = (mrv) this.c.get();
                        if (mrvVar4 == null) {
                            return (String) r19.get();
                        }
                        Object obj17 = this.a;
                        if (mrvVar4.a == 1) {
                            return ((yjr) ((mrw) obj17).b.b()).E(mrvVar4.b, anhl.E164);
                        }
                        if (r22.get() == mru.ALPHA_CODE_OR_PHONEWORD) {
                            return (String) r19.get();
                        }
                        if (mrvVar4.a == 2) {
                            return ((yjr) ((mrw) obj17).b.b()).F(mrvVar4.b);
                        }
                        mrw mrwVar2 = (mrw) obj17;
                        if (mrwVar2.u(mrvVar4)) {
                            return ((yjr) mrwVar2.b.b()).F(mrvVar4.b);
                        }
                        return (String) r19.get();
                    default:
                        throw new AssertionError("Unknown destination format: ".concat(String.valueOf(((mru) r22.get()).name())));
                }
            case 11:
                rae raeVar = (rae) this.c;
                anen anenVar = (anen) raeVar.b.b();
                anenVar.getClass();
                ?? b = raeVar.d.b();
                b.getClass();
                ?? r44 = raeVar.h;
                ?? r53 = raeVar.c;
                ?? r64 = raeVar.e;
                ?? r7 = raeVar.f;
                ?? r8 = raeVar.g;
                ?? r9 = raeVar.i;
                ?? r11 = raeVar.a;
                ?? r142 = this.e;
                ?? r132 = this.d;
                return new lfx(anenVar, r44, r53, r64, r7, r8, r9, b, r11, (BugleConversationId) this.a, r132, r142, this.b);
            default:
                Uri parse = Uri.parse((String) this.c);
                Object obj18 = this.d;
                Uri parse2 = Uri.parse((String) obj18);
                tbt tbtVar = new tbt();
                tbtVar.aj("UpdateAttachmentAfterResizingAction#executeAction");
                Object obj19 = this.b;
                tbtVar.q((tql) obj19);
                tbtVar.p();
                if (obj19 == tql.SUCCEEDED) {
                    Object obj20 = this.e;
                    tbtVar.s(parse);
                    tbtVar.e((String) obj20);
                }
                Object obj21 = this.a;
                tbtVar.v(new tux(parse, parse2, i));
                if (tbtVar.a().e() > 0) {
                    if (obj19 == tql.SUCCEEDED) {
                        ((UpdateAttachmentAfterResizingAction) obj21).d.h(new mla(16), null, new rah(obj21, parse2, 8, bArr));
                    }
                } else {
                    xyo d = UpdateAttachmentAfterResizingAction.a.d();
                    d.H("Attachment for");
                    d.H(obj18);
                    d.H("gone. Deleting output.");
                    d.q();
                    ((UpdateAttachmentAfterResizingAction) obj21).d.h(new mla(15), null, new rah(obj21, parse, i, bArr));
                }
                return Integer.valueOf(((UpdateAttachmentAfterResizingAction) obj21).c.a());
        }
    }

    public /* synthetic */ mrj(Object obj, alhr alhrVar, alhr alhrVar2, alhr alhrVar3, alhr alhrVar4, int i) {
        this.f = i;
        this.a = obj;
        this.b = alhrVar;
        this.c = alhrVar2;
        this.d = alhrVar3;
        this.e = alhrVar4;
    }

    public /* synthetic */ mrj(mrw mrwVar, alhr alhrVar, String str, alhr alhrVar2, alhr alhrVar3, int i) {
        this.f = i;
        this.a = mrwVar;
        this.b = alhrVar;
        this.e = str;
        this.c = alhrVar2;
        this.d = alhrVar3;
    }

    public /* synthetic */ mrj(mrw mrwVar, String str, alhr alhrVar, alhr alhrVar2, alhr alhrVar3, int i) {
        this.f = i;
        this.a = mrwVar;
        this.e = str;
        this.b = alhrVar;
        this.c = alhrVar2;
        this.d = alhrVar3;
    }

    public /* synthetic */ mrj(mui muiVar, BugleConversationId bugleConversationId, ncq ncqVar, ncq ncqVar2, rae raeVar, int i) {
        this.f = i;
        this.b = muiVar;
        this.a = bugleConversationId;
        this.d = ncqVar;
        this.e = ncqVar2;
        this.c = raeVar;
    }
}
