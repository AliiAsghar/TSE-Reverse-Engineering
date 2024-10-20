package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acpk {
    public String a;
    public String d;
    public String e;
    public String g;
    public acpg h;
    public final boolean i;
    public boolean j;
    public final acpj b = new acpj(acpg.FULL);
    public acpm c = new acpm();
    public final List f = new ArrayList();

    public acpk(acpg acpgVar, String str, boolean z, boolean z2) {
        acoy acoyVar = acoy.PENDING;
        this.g = str;
        this.h = acpgVar;
        this.i = z;
        this.j = z2;
    }

    private static Optional i(List list, String str, yjr yjrVar) {
        if (str == null) {
            return Optional.empty();
        }
        String k = adwf.k(str, yjrVar);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            acox acoxVar = (acox) it.next();
            String str2 = acoxVar.j;
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(k) && str2.contains(k)) {
                return Optional.of(acoxVar);
            }
        }
        return Optional.empty();
    }

    private static boolean j(acox acoxVar) {
        if (!acoxVar.c.b()) {
            return false;
        }
        if (acoxVar.f == acow.DEPARTED) {
            return true;
        }
        if (acoxVar.f != acow.FAILED) {
            return false;
        }
        Optional optional = acoxVar.g;
        if (optional.isEmpty() || ((acot) optional.get()).a != 603) {
            return false;
        }
        return true;
    }

    private static boolean k(acox acoxVar) {
        if (!acoxVar.c.b()) {
            return false;
        }
        if (acoxVar.f != acow.BOOTED && acoxVar.f != acow.BUSY) {
            return false;
        }
        return true;
    }

    private static final void l(Optional optional, Optional optional2) {
        if (!optional2.isEmpty() && ((acox) optional2.get()).b()) {
            if (k((acox) optional2.get())) {
                advr.g("Temporarily disconnected endpoint should not be in the update: %s", optional2);
                return;
            }
            if (optional.isEmpty()) {
                if (((acox) optional2.get()).c.a() || j((acox) optional2.get())) {
                    optional2.get();
                    return;
                }
                return;
            }
            acoy acoyVar = ((acox) optional.get()).c;
            acoy acoyVar2 = ((acox) optional2.get()).c;
            if (!acoyVar.b() && acoyVar2.b()) {
                advr.k("Endpoint needs to be notified because it has disconnected: %s", acoyVar2);
            }
            if (!acoyVar.a() && acoyVar2.a()) {
                advr.k("Endpoint needs to be notified because it has connected: %s", acoyVar2);
                return;
            }
            return;
        }
        advr.g("Invalid endpoint should not be in the update", new Object[0]);
    }

    public final acoy a() {
        Optional b = b();
        if (b.isEmpty()) {
            advr.g("User contains no endpoints", new Object[0]);
            return acoy.DISCONNECTED;
        }
        return ((acox) b.get()).c;
    }

    public final Optional b() {
        Optional empty = Optional.empty();
        for (acox acoxVar : this.f) {
            if (acoxVar.b() && acoxVar.k != acpg.DELETED) {
                if (acoxVar.c.a()) {
                    return Optional.of(acoxVar);
                }
                empty = Optional.of(acoxVar);
            }
        }
        return empty;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        for (acox acoxVar : this.f) {
            this.h = acpg.DELETED;
            acoxVar.c = acoy.DISCONNECTED;
            acoxVar.f = acow.DEPARTED;
            acoxVar.k = acpg.FULL;
            acoxVar.a = null;
            acoxVar.b = Optional.empty();
            acoxVar.d = acpb.UNKNOWN;
            acoxVar.e = Optional.empty();
            acoxVar.i = Optional.empty();
            acoxVar.h.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(acpk acpkVar, yjr yjrVar) {
        Optional empty;
        if (acpkVar.h()) {
            ArrayList arrayList = new ArrayList(this.f);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                acox acoxVar = (acox) arrayList.get(i);
                if (!acoxVar.b() || acoxVar.k == acpg.DELETED) {
                    advr.q("Clearing out invalid endpoint: %s", acoxVar);
                    this.f.remove(acoxVar);
                }
            }
            acpg acpgVar = acpkVar.h;
            acpg acpgVar2 = acpg.FULL;
            int ordinal = acpgVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        c();
                        return;
                    }
                    return;
                }
                if (!acpkVar.b.isEmpty()) {
                    acpj acpjVar = acpkVar.b;
                }
                String str = acpkVar.e;
                if (str != null) {
                    this.e = str;
                }
                String str2 = acpkVar.a;
                if (str2 != null) {
                    this.a = str2;
                }
                String str3 = acpkVar.d;
                if (str3 != null) {
                    this.d = str3;
                }
                if (!acpkVar.f.isEmpty()) {
                    List<acox> list = acpkVar.f;
                    Optional b = b();
                    if (b.isPresent()) {
                        b = Optional.of(new acox((acox) b.get()));
                    }
                    for (acox acoxVar2 : list) {
                        if (!acoxVar2.b()) {
                            advr.k("Skipping invalid endpoint during partial update: %s", acoxVar2);
                        } else if (k(acoxVar2)) {
                            advr.k("Skipping temporary disconnect endpoint during partial update: %s", acoxVar2);
                        } else {
                            String str4 = acoxVar2.j;
                            Iterator it = this.f.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    acox acoxVar3 = (acox) it.next();
                                    if (!acoxVar3.b()) {
                                        advr.g("User contains invalid endpoint!", new Object[0]);
                                    } else {
                                        String str5 = acoxVar3.j;
                                        if (str5 != null) {
                                            if (str5.equals(str4)) {
                                                empty = Optional.of(acoxVar3);
                                                break;
                                            }
                                        } else {
                                            throw new IllegalStateException("Local entity is null");
                                        }
                                    }
                                } else {
                                    empty = Optional.empty();
                                    break;
                                }
                            }
                            if (empty.isEmpty()) {
                                this.f.add(acoxVar2);
                            } else {
                                ((acox) empty.get()).a(acoxVar2);
                            }
                        }
                    }
                    l(b, b());
                    e();
                }
                if (!acpkVar.c.isEmpty()) {
                    this.c = acpkVar.c;
                    return;
                }
                return;
            }
            acpj acpjVar2 = acpkVar.b;
            this.e = acpkVar.e;
            this.a = acpkVar.a;
            this.d = acpkVar.d;
            List<acox> list2 = acpkVar.f;
            Optional b2 = b();
            if (b2.isPresent()) {
                b2 = Optional.of(new acox((acox) b2.get()));
            }
            Iterator it2 = this.f.iterator();
            while (it2.hasNext()) {
                acox acoxVar4 = (acox) it2.next();
                Optional i2 = i(list2, acoxVar4.j, yjrVar);
                if (i2.isPresent()) {
                    if (((acox) i2.get()).b() && k((acox) i2.get())) {
                        advr.k("Skipping temporary disconnect endpoint during full update: %s", i2);
                    } else {
                        acoxVar4.a((acox) i2.get());
                    }
                } else {
                    it2.remove();
                }
            }
            for (acox acoxVar5 : list2) {
                if (!acoxVar5.b()) {
                    advr.k("Skipping invalid endpoint during full update: %s", acoxVar5);
                } else if (k(acoxVar5)) {
                    advr.k("Skipping temporary disconnect endpoint during full update: %s", acoxVar5);
                } else if (!i(this.f, acoxVar5.j, yjrVar).isPresent()) {
                    this.f.add(acoxVar5);
                }
            }
            l(b2, b());
            e();
            this.c = acpkVar.c;
        }
    }

    public final void e() {
        this.j = a().a();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof acpk)) {
            return false;
        }
        acpk acpkVar = (acpk) obj;
        if (this.h != acpkVar.h || this.j != acpkVar.j || this.i != acpkVar.i || !TextUtils.equals(this.g, acpkVar.g) || !TextUtils.equals(this.a, acpkVar.a) || !TextUtils.equals(this.d, acpkVar.d) || !TextUtils.equals(this.e, acpkVar.e) || !this.f.equals(acpkVar.f) || !this.b.equals(acpkVar.b) || !this.c.equals(acpkVar.c)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        acoy acoyVar;
        if (h()) {
            Optional b = b();
            if (b.isPresent() && ((acox) b.get()).b() && (acoyVar = ((acox) b.get()).c) != acoy.PENDING && acoyVar != acoy.DIALING_IN && acoyVar != acoy.DIALING_OUT && acoyVar != acoy.ALERTING && acoyVar != acoy.DISCONNECTING && !k((acox) b.get())) {
                b.get();
            }
        }
    }

    public final boolean g() {
        Optional b = b();
        if (b.isEmpty() || j((acox) b.get())) {
            return false;
        }
        return true;
    }

    public final boolean h() {
        if (TextUtils.isEmpty(this.g)) {
            advr.q("Invalid user. Entity is empty.", new Object[0]);
            return false;
        }
        if (this.h == acpg.NONE) {
            advr.q("Invalid user. State is NONE.", new Object[0]);
            return false;
        }
        if (this.h == acpg.FULL && this.f.isEmpty()) {
            advr.q("Invalid user. Full state contains no endpoints.", new Object[0]);
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.h, Boolean.valueOf(this.j), Boolean.valueOf(this.i), this.g, this.a, this.d, this.e, this.f, this.b, this.c});
    }

    public final String toString() {
        String c = advq.USER_ID.c(this.a);
        String c2 = advq.USER_ID.c(this.g);
        String valueOf = String.valueOf(this.h);
        List list = this.f;
        return "User [mDisplaytext=" + c + ", mEntity=" + c2 + ", mState=" + valueOf + ", mYourOwn=" + this.i + ", mHasJoined=" + this.j + ", mEndpoints=" + list.toString() + "]";
    }
}
