package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kgf extends arpw implements arqx {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ boolean c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kgf(jsa jsaVar, arpe arpeVar, int i) {
        super(4, arpeVar);
        this.e = i;
        this.d = jsaVar;
    }

    @Override // defpackage.arqx
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            boolean booleanValue = ((Boolean) obj2).booleanValue();
                            kgf kgfVar = new kgf((wyp) this.d, (arpe) obj4, 5);
                            kgfVar.a = (miu) obj;
                            kgfVar.c = booleanValue;
                            kgfVar.b = (alog) obj3;
                            return kgfVar.b(arnb.a);
                        }
                        boolean booleanValue2 = ((Boolean) obj3).booleanValue();
                        kgf kgfVar2 = new kgf((mgu) this.d, (arpe) obj4, 4);
                        kgfVar2.a = (khd) obj;
                        kgfVar2.b = (String) obj2;
                        kgfVar2.c = booleanValue2;
                        return kgfVar2.b(arnb.a);
                    }
                    boolean booleanValue3 = ((Boolean) obj3).booleanValue();
                    kgf kgfVar3 = new kgf((kgu) this.d, (arpe) obj4, 3);
                    kgfVar3.a = (alog) obj;
                    kgfVar3.b = (miz) obj2;
                    kgfVar3.c = booleanValue3;
                    return kgfVar3.b(arnb.a);
                }
                boolean booleanValue4 = ((Boolean) obj3).booleanValue();
                kgf kgfVar4 = new kgf((kgj) this.d, (arpe) obj4, 2);
                kgfVar4.a = (alog) obj;
                kgfVar4.b = (miu) obj2;
                kgfVar4.c = booleanValue4;
                return kgfVar4.b(arnb.a);
            }
            boolean booleanValue5 = ((Boolean) obj2).booleanValue();
            kgf kgfVar5 = new kgf((jsa) this.d, (arpe) obj4, 1);
            kgfVar5.a = (jjh) obj;
            kgfVar5.c = booleanValue5;
            kgfVar5.b = (lsa) obj3;
            return kgfVar5.b(arnb.a);
        }
        boolean booleanValue6 = ((Boolean) obj3).booleanValue();
        kgf kgfVar6 = new kgf((kgg) this.d, (arpe) obj4, 0);
        kgfVar6.a = (alog) obj;
        kgfVar6.b = (miu) obj2;
        kgfVar6.c = booleanValue6;
        return kgfVar6.b(arnb.a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v38, types: [miu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v41, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [miu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [miu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [armf, java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        boolean z;
        rl rlVar;
        String string;
        boolean z2;
        String z3;
        String b;
        ResolvedRecipient resolvedRecipient;
        msh f;
        msf F;
        int i = this.e;
        String str = null;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            aqil.P(obj);
                            ?? r1 = this.a;
                            boolean z4 = this.c;
                            ?? r3 = this.b;
                            String h = r1.h();
                            wyp wypVar = (wyp) this.d;
                            if (r1.b() != mit.GROUP && !z4) {
                                ResolvedRecipient resolvedRecipient2 = (ResolvedRecipient) aqjn.ag(r3);
                                if (resolvedRecipient2.u()) {
                                    b = ((wfh) wypVar.e).z(resolvedRecipient2.f().F().toString());
                                } else {
                                    String s = resolvedRecipient2.s();
                                    if (s != null) {
                                        if (qta.r()) {
                                            z3 = wfh.x(s);
                                        } else {
                                            z3 = ((wfh) wypVar.e).z(s);
                                        }
                                        z3.getClass();
                                        b = vom.b(z3);
                                    }
                                }
                                if (((oyn) ((wyp) this.d).g.b()).a() && r1.b() != mit.GROUP && (resolvedRecipient = (ResolvedRecipient) aqjn.Z(r3)) != null && (f = resolvedRecipient.f()) != null && (F = f.F()) != null) {
                                    str = F.a;
                                }
                                return new zzf(h, b, str, ((oyn) ((wyp) this.d).g.b()).a());
                            }
                            b = null;
                            if (((oyn) ((wyp) this.d).g.b()).a()) {
                                str = F.a;
                            }
                            return new zzf(h, b, str, ((oyn) ((wyp) this.d).g.b()).a());
                        }
                        aqil.P(obj);
                        Object obj2 = this.a;
                        Object obj3 = this.b;
                        boolean z5 = this.c;
                        if (obj3 != null) {
                            return ((mgu) this.d).h;
                        }
                        if (!((khd) obj2).a.isEmpty()) {
                            return ((mgu) this.d).g;
                        }
                        return ((mgu) this.d).m(z5);
                    }
                    aqil.P(obj);
                    Object obj4 = this.a;
                    Object obj5 = this.b;
                    if (this.c) {
                        return new armo(obj4, obj5);
                    }
                    ((kgu) this.d).m.e(null);
                    int i2 = alog.d;
                    return new armo(alsx.a, null);
                }
                aqil.P(obj);
                ?? r12 = this.a;
                ?? r7 = this.b;
                boolean z6 = this.c;
                ArrayList arrayList = new ArrayList(aqjn.J(r12, 10));
                for (mty mtyVar : r12) {
                    Object obj6 = this.d;
                    kgj kgjVar = (kgj) obj6;
                    kam j = kgjVar.e.j(mtyVar, null, null);
                    mit b2 = r7.b();
                    mit mitVar = mit.GROUP;
                    tqc g = r7.g();
                    g.getClass();
                    if (b2 == mitVar) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    arrayList.add(new kgl(kgjVar.d.v(new jzz(j, z2, g, null, null, false, false, false, false, false, null, false, false, false, false, 261560)), mtyVar.b(), z6));
                }
                String string2 = ((kgj) this.d).a.getString(R.string.scheduled_messages_list_button_text, new Integer(((alog) r12).size()));
                string2.getClass();
                return new kgk(arrayList, new aeqi(string2, z6, new jwl(this.d, 10, (int[][]) null)));
            }
            aqil.P(obj);
            Object obj7 = this.a;
            boolean z7 = this.c;
            Object obj8 = this.b;
            if (obj7 == null) {
                return ((jsa) this.d).o;
            }
            Object obj9 = this.d;
            jmp jmpVar = new jmp(z7, obj9, 2);
            if (z7) {
                rlVar = new rl(obj9, 13, (byte[][][]) null);
            } else {
                rlVar = new rl(obj9, 14, (float[][]) null);
            }
            jsa jsaVar = (jsa) obj9;
            rl rlVar2 = rlVar;
            if (((Boolean) jsaVar.i.b()).booleanValue() && ((oqb) ((jsa) this.d).j.b()).a()) {
                Object obj10 = this.d;
                if (obj8 == null) {
                    string = ((jsa) obj10).c.getString(((jjh) obj7).b);
                    string.getClass();
                } else {
                    throw null;
                }
            } else {
                string = ((jsa) this.d).c.getString(((jjh) obj7).b);
                string.getClass();
            }
            String str2 = string;
            jjh jjhVar = (jjh) obj7;
            Integer num = jjhVar.c;
            if (num != null) {
                str = ((jsa) this.d).c.getString(num.intValue());
            }
            return aeoi.a(jsaVar.o, jjhVar.a, jmpVar, rlVar2, str2, str, z7, null, 64);
        }
        aqil.P(obj);
        ?? r13 = this.a;
        ?? r72 = this.b;
        boolean z8 = this.c;
        ArrayList arrayList2 = new ArrayList(aqjn.J(r13, 10));
        for (mty mtyVar2 : r13) {
            Object obj11 = this.d;
            kgg kggVar = (kgg) obj11;
            kam j2 = kggVar.e.j(mtyVar2, null, null);
            mit b3 = r72.b();
            mit mitVar2 = mit.GROUP;
            tqc g2 = r72.g();
            g2.getClass();
            if (b3 == mitVar2) {
                z = true;
            } else {
                z = false;
            }
            arrayList2.add(new kgl(kggVar.d.v(new jzz(j2, z, g2, null, null, false, false, false, false, false, null, false, false, false, false, 261560)), mtyVar2.b(), z8));
        }
        String string3 = ((kgg) this.d).a.getString(R.string.scheduled_messages_list_button_text, new Integer(((alog) r13).size()));
        string3.getClass();
        return new kgk(arrayList2, new aeqi(string3, z8, new jwl(this.d, 8, (byte[][]) null)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kgf(kgg kggVar, arpe arpeVar, int i) {
        super(4, arpeVar);
        this.e = i;
        this.d = kggVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kgf(kgj kgjVar, arpe arpeVar, int i) {
        super(4, arpeVar);
        this.e = i;
        this.d = kgjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kgf(kgu kguVar, arpe arpeVar, int i) {
        super(4, arpeVar);
        this.e = i;
        this.d = kguVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kgf(mgu mguVar, arpe arpeVar, int i) {
        super(4, arpeVar);
        this.e = i;
        this.d = mguVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kgf(wyp wypVar, arpe arpeVar, int i) {
        super(4, arpeVar);
        this.e = i;
        this.d = wypVar;
    }
}
