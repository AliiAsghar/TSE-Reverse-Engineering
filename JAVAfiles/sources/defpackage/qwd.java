package defpackage;

import j$.util.Comparator;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qwd implements qvb {
    public static final /* synthetic */ int a = 0;
    private static final alwo b = alwo.o("BugleSelfIdentity");
    private final agnq c;
    private final armf d;
    private final pkx e;
    private final arpi f;

    public qwd(agnq agnqVar, armf armfVar, pkx pkxVar, arpi arpiVar) {
        agnqVar.getClass();
        armfVar.getClass();
        arpiVar.getClass();
        this.c = agnqVar;
        this.d = armfVar;
        this.e = pkxVar;
        this.f = arpiVar;
    }

    private static final qwc k(qwe qweVar, qxc qxcVar) {
        qvi qviVar = new qvi();
        qviVar.d(qxcVar.d);
        riw.p(qviVar, qxcVar.e);
        qviVar.ah();
        return new qwc(qweVar, qviVar.b(qweVar));
    }

    @Override // defpackage.qvb
    public final qvl a(Iterable iterable) {
        Object c = this.c.c("MyIdentityTablesOperations#updateSubscriptionsAndIdentities", new ndb(iterable, this, 6));
        c.getClass();
        return (qvl) c;
    }

    @Override // defpackage.qvb
    public final Object b(arpe arpeVar) {
        return arro.q(this.f, new pze(this, (arpe) null, 8), arpeVar);
    }

    @Override // defpackage.qvb
    public final Object c(Iterable iterable, arpe arpeVar) {
        return arro.q(this.f, new naw(iterable, this, (arpe) null, 14), arpeVar);
    }

    @Override // defpackage.qvb
    public final Object d(qwe qweVar, arpe arpeVar) {
        return arro.q(this.f, new naw(qweVar, this, (arpe) null, 15), arpeVar);
    }

    @Override // defpackage.qvb
    @armg
    public final Object e(qwe qweVar, arpe arpeVar) {
        return arro.q(this.f, new naw(qweVar, this, (arpe) null, 16, (byte[]) null), arpeVar);
    }

    @Override // defpackage.qvb
    public final Object f(Collection collection, arpe arpeVar) {
        return arro.q(this.f, new naw(collection, this, (arpe) null, 17), arpeVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qvq
    public final qwe g(int i, String str, msh mshVar) {
        Object obj;
        if (i >= -1) {
            if (str != null && str.length() != 0 && i >= 0) {
                Object c = this.c.c("getOrCreateMyIdentityViaUpdateHelper", new qwb(this, i, str, mshVar, 0));
                c.getClass();
                return (qwe) c;
            }
            qwt a2 = qww.a();
            a2.w("querySubWithUnknownIccId");
            a2.c(new qqv(i, 2));
            alog t = a2.b().t();
            t.getClass();
            ArrayList arrayList = new ArrayList(aqjn.J(t, 10));
            alur it = t.iterator();
            while (it.hasNext()) {
                arrayList.add(new uac((qwo) it.next()));
            }
            if (arrayList.size() == 1) {
                return (qwe) ((uac) arrayList.get(0)).b;
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj = it2.next();
                    if (d.F(((uac) obj).a, "unknown_iccid")) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            uac uacVar = (uac) obj;
            if (uacVar != null) {
                return (qwe) uacVar.b;
            }
            Object c2 = this.c.c("createIdentityForSubWithUnknownIccId", new fep(i, 3));
            c2.getClass();
            return (qwe) c2;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final msh h(String str) {
        msk mskVar = (msk) this.d.b();
        msu msuVar = new msu(15);
        if (str == null) {
            str = "";
        }
        return mskVar.c(str, msuVar);
    }

    public final qvo i(qvw qvwVar) {
        alpt alptVar;
        if (qvwVar.e().length == qvwVar.f().length) {
            Optional.empty();
            Optional.empty();
            Optional.empty();
            boolean z = false;
            qvwVar.ao(0, "token");
            qwe qweVar = qvwVar.a;
            if (qweVar != null) {
                Optional ofNullable = Optional.ofNullable(qvwVar.d());
                qvwVar.ao(3, "address_type");
                qvn qvnVar = qvwVar.c;
                if (qvnVar != null) {
                    Optional map = Optional.ofNullable(qvwVar.d()).map(new qsb(new qin(this, 10), 11));
                    if (map != null) {
                        qvwVar.ao(5, "display_name");
                        String str = qvwVar.d;
                        if (str == null) {
                            str = "";
                        }
                        String str2 = str;
                        qvwVar.ao(1, "provisioning_id");
                        String str3 = qvwVar.b;
                        alpr alprVar = null;
                        if (str3 == null || str3.length() == 0) {
                            str3 = null;
                        }
                        Optional ofNullable2 = Optional.ofNullable(str3);
                        int length = qvwVar.e().length;
                        int i = 0;
                        while (i < length) {
                            int[] iArr = qvwVar.e;
                            if (i < iArr.length) {
                                int i2 = iArr[i];
                                String[] strArr = qvwVar.f;
                                if (i < strArr.length) {
                                    String str4 = strArr[i];
                                    if (alprVar == null) {
                                        alprVar = new alpr();
                                    }
                                    alprVar.c(new qwl(i2, str4));
                                    i++;
                                    z = false;
                                } else {
                                    throw new IndexOutOfBoundsException(String.format("index %d not in range 0 ... %d", Integer.valueOf(i), Integer.valueOf(qvwVar.f.length)));
                                }
                            } else {
                                Integer valueOf = Integer.valueOf(i);
                                Integer valueOf2 = Integer.valueOf(qvwVar.e.length);
                                Object[] objArr = new Object[2];
                                objArr[z ? 1 : 0] = valueOf;
                                objArr[1] = valueOf2;
                                throw new IndexOutOfBoundsException(String.format("index %d not in range 0 ... %d", objArr));
                            }
                        }
                        if (alprVar != null) {
                            alptVar = alprVar.g();
                        } else {
                            alptVar = altg.a;
                        }
                        return new qvo(alptVar, ofNullable, qvnVar, map, qweVar, str2, ofNullable2);
                    }
                    throw new NullPointerException("Null messagingIdentity");
                }
                throw new NullPointerException("Null addressType");
            }
            throw new NullPointerException("Null token");
        }
        throw new IllegalStateException("SubIds length " + qvwVar.e().length + " != sim iccIds length " + qvwVar.f().length);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, agpj] */
    public final qwc j(qxc qxcVar) {
        qwe qweVar;
        Object obj;
        alog t;
        Object obj2;
        qwe qweVar2;
        Object obj3;
        qwc qwcVar;
        byte b2;
        qwt a2 = qww.a();
        a2.w("MyIdentityTablesOperations#subsInTheSim");
        a2.c(new qsb(qxcVar, 8));
        alog t2 = a2.b().t();
        t2.getClass();
        alur it = t2.iterator();
        while (true) {
            qweVar = null;
            b2 = 0;
            if (it.hasNext()) {
                obj = it.next();
                if (((qwo) obj).d() == qxcVar.a) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        qwo qwoVar = (qwo) obj;
        if (qwoVar != null && qwoVar.e() != null && (qxcVar.a() == null || d.F(h(qwoVar.h()), qxcVar.c))) {
            alwl alwlVar = (alwl) b.g();
            alwlVar.X(ydl.t, Integer.valueOf(qxcVar.a));
            alwlVar.q("Phone number does not change");
            qwe e = qwoVar.e();
            e.getClass();
            return k(e, qxcVar);
        }
        ArrayList arrayList = new ArrayList();
        alur it2 = t2.iterator();
        while (it2.hasNext()) {
            qwe e2 = ((qwo) it2.next()).e();
            if (e2 != null) {
                arrayList.add(e2);
            }
        }
        List ak = aqjn.ak(arrayList);
        boolean z = true;
        if (qxcVar.a() == null) {
            if (ak.isEmpty()) {
                qwe qweVar3 = new qwe(UUID.randomUUID());
                alwl alwlVar2 = (alwl) b.g();
                alwlVar2.X(ydl.t, Integer.valueOf(qxcVar.a));
                alwlVar2.t("Create new MyIdentity %s for sub with unknown number", qweVar3);
                qvd a3 = qvk.a();
                a3.g(qweVar3);
                a3.d(qvn.a);
                a3.e(qxcVar.d);
                riw.o(a3, qxcVar.e);
                a3.a().h();
                qwcVar = new qwc(qweVar3, true);
            } else {
                Comparator naturalOrder = Comparator.CC.naturalOrder();
                naturalOrder.getClass();
                Iterator it3 = ak.iterator();
                if (it3.hasNext()) {
                    Object next = it3.next();
                    while (it3.hasNext()) {
                        Object next2 = it3.next();
                        if (naturalOrder.compare(next, next2) > 0) {
                            next = next2;
                        }
                    }
                    qwe qweVar4 = (qwe) next;
                    alwl alwlVar3 = (alwl) b.i();
                    alwlVar3.X(ydl.t, Integer.valueOf(qxcVar.a));
                    alwlVar3.B("MyIdentity %s has a sub with unknown number, existing tokens size: %s", qweVar4, ak.size());
                    qwcVar = k(qweVar4, qxcVar);
                } else {
                    throw new NoSuchElementException();
                }
            }
        } else if (qxcVar.c != null) {
            if (this.e.a()) {
                qvh b3 = qvk.b();
                b3.w("getOrCreateMyIdentityTokenForChangePendingSub");
                b3.c(new qvm(5));
                b3.c(new mut(qxcVar, ak, 18, b2 == true ? 1 : 0));
                b3.y(qvk.d.c);
                t = b3.b().t();
            } else {
                qvh b4 = qvk.b();
                b4.w("getOrCreateMyIdentityTokenForChangePendingSub");
                b4.c(new qsb(ak, 10));
                b4.c(new qvm(6));
                t = b4.b().t();
            }
            t.getClass();
            alur it4 = t.iterator();
            while (true) {
                if (it4.hasNext()) {
                    obj2 = it4.next();
                    if (d.F(qxcVar.c, h(((qvc) obj2).e()))) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            qvc qvcVar = (qvc) obj2;
            if (qvcVar != null) {
                qweVar2 = qvcVar.d();
            } else {
                qweVar2 = null;
            }
            if (qweVar2 != null) {
                alwl alwlVar4 = (alwl) b.g();
                alwlVar4.X(ydl.t, Integer.valueOf(qxcVar.a));
                alwlVar4.B("MyIdentity %s owns the sub, existing identities on SIM %s", qweVar2, ((alsx) t).c);
                qwcVar = k(qweVar2, qxcVar);
            } else {
                alur it5 = t.iterator();
                while (true) {
                    if (it5.hasNext()) {
                        obj3 = it5.next();
                        qvc qvcVar2 = (qvc) obj3;
                        String e3 = qvcVar2.e();
                        if (e3 == null || e3.length() == 0) {
                            qvcVar2.ao(3, "address_type");
                            if (qvcVar2.d == qvn.a) {
                                break;
                            }
                        }
                    } else {
                        obj3 = null;
                        break;
                    }
                }
                qvc qvcVar3 = (qvc) obj3;
                if (qvcVar3 != null) {
                    qweVar = qvcVar3.d();
                }
                if (qweVar != null) {
                    qvi qviVar = new qvi();
                    agnc.r(qviVar.a, "phone_number", qxcVar.a());
                    qviVar.d(qxcVar.d);
                    riw.p(qviVar, qxcVar.e);
                    boolean b5 = qviVar.b(qweVar);
                    alwl alwlVar5 = (alwl) b.g();
                    alwlVar5.X(ydl.t, Integer.valueOf(qxcVar.a));
                    alwlVar5.J("Group and claim the existing MyIdentity %s, updated %s, existing identities on SIM %s", qweVar, Boolean.valueOf(b5), Integer.valueOf(((alsx) t).c));
                    qwcVar = new qwc(qweVar, b5);
                } else {
                    qwe qweVar5 = new qwe(UUID.randomUUID());
                    alwl alwlVar6 = (alwl) b.g();
                    alwlVar6.X(ydl.t, Integer.valueOf(qxcVar.a));
                    alwlVar6.B("Create new MyIdentity %s, existing identities on SIM %s", qweVar5, ((alsx) t).c);
                    qvd a4 = qvk.a();
                    a4.g(qweVar5);
                    a4.c(qxcVar.a());
                    a4.e(qxcVar.d);
                    riw.o(a4, qxcVar.e);
                    a4.d(qvn.a);
                    a4.a().h();
                    qwcVar = new qwc(qweVar5, true);
                }
            }
        } else {
            throw new IllegalStateException("SubInfo telephony phone number is empty");
        }
        int i = qxcVar.a;
        std e4 = qww.e();
        e4.j(i);
        e4.i(qxcVar.b);
        e4.g(qwcVar.a);
        if (qxcVar.a() != null) {
            e4.k(qxcVar.a());
        }
        boolean k = e4.f().k(new qsb(qxcVar, 9));
        if (!k) {
            alwl alwlVar7 = (alwl) b.i();
            alwlVar7.X(ydl.t, Integer.valueOf(qxcVar.a));
            alwlVar7.q("Subs table has no change when update or insert");
        }
        qwe qweVar6 = qwcVar.a;
        if (!qwcVar.b && !k) {
            z = false;
        }
        return new qwc(qweVar6, z);
    }
}
