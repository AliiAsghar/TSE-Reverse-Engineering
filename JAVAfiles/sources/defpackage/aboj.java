package defpackage;

import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aboj {
    public final int c;
    public final ReentrantReadWriteLock d;
    public volatile int e;
    public volatile Future f;
    public long g;
    public final Map h;
    public abod i;
    public final LinkedHashSet j;
    public final abvc l;
    private final String n;
    private final abnr o;
    private ScheduledExecutorService p;
    private volatile abof q;
    public static final abob k = new abob();
    private static final Charset m = Charset.forName("UTF-8");
    static final abod a = new abod();
    public static final abod b = new abod();

    public aboj(abnr abnrVar, String str, int i) {
        this(abnrVar, str, i, abvc.a);
    }

    public static long a(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes(m));
            return ByteBuffer.wrap(messageDigest.digest()).getLong();
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }

    public final abny b(String str, alhr alhrVar) {
        this.d.writeLock().lock();
        try {
            abny abnyVar = (abny) alhrVar.get();
            this.h.put(str, abnyVar);
            return abnyVar;
        } finally {
            this.d.writeLock().unlock();
        }
    }

    public final aboc c(String str) {
        ReentrantReadWriteLock reentrantReadWriteLock;
        this.d.writeLock().lock();
        try {
            Object obj = (abny) this.h.get(str);
            if (obj == null) {
                obj = (aboc) b(str, new ylq(this, str, 6));
                reentrantReadWriteLock = this.d;
            } else {
                reentrantReadWriteLock = this.d;
            }
            reentrantReadWriteLock.writeLock().unlock();
            return (aboc) obj;
        } catch (Throwable th) {
            this.d.writeLock().unlock();
            throw th;
        }
    }

    public final aboe d(String str) {
        ReentrantReadWriteLock reentrantReadWriteLock;
        this.d.writeLock().lock();
        try {
            Object obj = (abny) this.h.get(str);
            if (obj == null) {
                obj = (aboe) b(str, new ylq(this, str, 7));
                reentrantReadWriteLock = this.d;
            } else {
                reentrantReadWriteLock = this.d;
            }
            reentrantReadWriteLock.writeLock().unlock();
            return (aboe) obj;
        } catch (Throwable th) {
            this.d.writeLock().unlock();
            throw th;
        }
    }

    public final abog e(String str) {
        abnz abnzVar;
        abob abobVar = k;
        this.d.writeLock().lock();
        try {
            abny abnyVar = (abny) this.h.get(str);
            if (abnyVar == null) {
                abnzVar = (abog) b(str, new tdw(this, str, abobVar, 16, (short[]) null));
            } else {
                try {
                    abnz abnzVar2 = (abnz) abnyVar;
                    if (abobVar.equals(abnzVar2.f)) {
                        abnzVar = abnzVar2;
                    } else {
                        throw new IllegalArgumentException(a.cp(str, "alias mismatch: "));
                    }
                } catch (ClassCastException e) {
                    throw new IllegalArgumentException(a.cp(str, "another type of counter exists with name: "), e);
                }
            }
            this.d.writeLock().unlock();
            return (abog) abnzVar;
        } catch (Throwable th) {
            this.d.writeLock().unlock();
            throw th;
        }
    }

    public final acir f() {
        boolean z;
        this.d.writeLock().lock();
        try {
            aboj abojVar = new aboj(this);
            this.d.writeLock().unlock();
            int size = abojVar.j.size();
            abnq[] abnqVarArr = new abnq[size];
            Iterator it = abojVar.j.iterator();
            int i = 0;
            while (it.hasNext()) {
                abod abodVar = (abod) it.next();
                abnr abnrVar = abojVar.o;
                abhg.m(abodVar);
                ArrayList arrayList = new ArrayList(abojVar.h.size());
                for (abny abnyVar : abojVar.h.values()) {
                    if (abnyVar.c.containsKey(abodVar)) {
                        arrayList.add(abnyVar);
                    }
                }
                aozy createBuilder = apwg.a.createBuilder();
                long j = abojVar.g;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apwg apwgVar = (apwg) createBuilder.b;
                apwgVar.b |= 1;
                apwgVar.c = j;
                abhg.h(!b.equals(abodVar));
                if (!a.equals(abodVar)) {
                    apbt apbtVar = abodVar.a;
                    abhg.m(apbtVar);
                    aozb byteString = apbtVar.toByteString();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    apwg apwgVar2 = (apwg) createBuilder.b;
                    byteString.getClass();
                    apwgVar2.b |= 4;
                    apwgVar2.e = byteString;
                }
                int size2 = arrayList.size();
                int i2 = 0;
                while (i2 < size2) {
                    abny abnyVar2 = (abny) arrayList.get(i2);
                    uj ujVar = (uj) abnyVar2.c.get(abodVar);
                    abhg.m(ujVar);
                    aozy createBuilder2 = apwf.a.createBuilder();
                    long a2 = a(abnyVar2.a);
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    apwf apwfVar = (apwf) createBuilder2.b;
                    Iterator it2 = it;
                    apwfVar.b = 1;
                    apwfVar.c = Long.valueOf(a2);
                    ArrayList arrayList2 = new ArrayList(ujVar.b());
                    abod abodVar2 = abodVar;
                    int i3 = 0;
                    while (i3 < ujVar.b()) {
                        aozy createBuilder3 = apwe.a.createBuilder();
                        ArrayList arrayList3 = arrayList;
                        int i4 = size2;
                        long j2 = ((long[]) ujVar.e(i3))[0];
                        if (!createBuilder3.b.isMutable()) {
                            createBuilder3.u();
                        }
                        apwe apweVar = (apwe) createBuilder3.b;
                        aboj abojVar2 = abojVar;
                        apweVar.b |= 2;
                        apweVar.d = j2;
                        long c = ujVar.c(i3);
                        if (abnyVar2 instanceof aboc) {
                            if (c == 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            abhg.h(z);
                        } else {
                            if (!createBuilder3.b.isMutable()) {
                                createBuilder3.u();
                            }
                            apwe apweVar2 = (apwe) createBuilder3.b;
                            apweVar2.b |= 1;
                            apweVar2.c = c;
                        }
                        arrayList2.add((apwe) createBuilder3.s());
                        i3++;
                        abojVar = abojVar2;
                        arrayList = arrayList3;
                        size2 = i4;
                    }
                    aboj abojVar3 = abojVar;
                    ArrayList arrayList4 = arrayList;
                    int i5 = size2;
                    Collections.sort(arrayList2, new zyv(3));
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    apwf apwfVar2 = (apwf) createBuilder2.b;
                    apax apaxVar = apwfVar2.d;
                    if (!apaxVar.c()) {
                        apwfVar2.d = apag.mutableCopy(apaxVar);
                    }
                    aoyj.addAll(arrayList2, apwfVar2.d);
                    apwf apwfVar3 = (apwf) createBuilder2.s();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    apwg apwgVar3 = (apwg) createBuilder.b;
                    apwfVar3.getClass();
                    apax apaxVar2 = apwgVar3.d;
                    if (!apaxVar2.c()) {
                        apwgVar3.d = apag.mutableCopy(apaxVar2);
                    }
                    apwgVar3.d.add(apwfVar3);
                    i2++;
                    abodVar = abodVar2;
                    abojVar = abojVar3;
                    it = it2;
                    arrayList = arrayList4;
                    size2 = i5;
                }
                abnqVarArr[i] = abnrVar.g((apwg) createBuilder.s());
                i++;
                abojVar = abojVar;
            }
            aboj abojVar4 = abojVar;
            acir acirVar = null;
            for (int i6 = 0; i6 < size; i6++) {
                abnq abnqVar = abnqVarArr[i6];
                abnqVar.j = abojVar4.n;
                acirVar = abnqVar.c();
            }
            if (acirVar != null) {
                return acirVar;
            }
            return actx.s(null);
        } catch (Throwable th) {
            this.d.writeLock().unlock();
            throw th;
        }
    }

    public final void g() {
        this.d.writeLock().lock();
        try {
            Future future = this.f;
            if (future != null) {
                future.cancel(false);
            }
            this.f = this.p.schedule(new aaxu(this, 11), this.e, TimeUnit.MILLISECONDS);
        } finally {
            this.d.writeLock().unlock();
        }
    }

    public final void h(ScheduledExecutorService scheduledExecutorService, int i) {
        this.d.writeLock().lock();
        try {
            this.p = scheduledExecutorService;
            if (scheduledExecutorService != null) {
                this.e = i;
                g();
            } else {
                this.e = 0;
            }
        } finally {
            this.d.writeLock().unlock();
        }
    }

    public final void i(apbt apbtVar) {
        this.d.writeLock().lock();
        try {
            this.i = abod.a(apbtVar);
        } finally {
            this.d.writeLock().unlock();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        this.d.readLock().lock();
        try {
            sb.append("{");
            new algs(", ").h(sb, this.j);
            sb.append("}\n");
            new algs("\n").h(sb, this.h.values());
            this.d.readLock().unlock();
            return sb.toString();
        } catch (Throwable th) {
            this.d.readLock().unlock();
            throw th;
        }
    }

    public aboj(abnr abnrVar, String str, int i, abvc abvcVar) {
        this.d = new ReentrantReadWriteLock();
        this.h = new TreeMap();
        this.i = a;
        this.j = new LinkedHashSet();
        this.q = null;
        this.o = abnrVar;
        this.n = str;
        d.s(true);
        this.c = i;
        this.l = abvcVar;
        this.g = SystemClock.elapsedRealtime();
    }

    private aboj(aboj abojVar) {
        this(abojVar.o, abojVar.n, abojVar.c, abojVar.l);
        abny aboaVar;
        ReentrantReadWriteLock.WriteLock writeLock = abojVar.d.writeLock();
        writeLock.lock();
        try {
            this.i = abojVar.i;
            this.g = abojVar.g;
            for (Map.Entry entry : abojVar.h.entrySet()) {
                Map map = this.h;
                String str = (String) entry.getKey();
                abny abnyVar = (abny) entry.getValue();
                if (abnyVar instanceof aboc) {
                    aboaVar = new aboc(this, (aboc) abnyVar);
                } else if (abnyVar instanceof aboi) {
                    aboaVar = new aboi(this, (aboi) abnyVar);
                } else if (abnyVar instanceof aboe) {
                    aboaVar = new aboe(this, (aboe) abnyVar);
                } else if (abnyVar instanceof abog) {
                    aboaVar = new abog(this, (abog) abnyVar);
                } else if (abnyVar instanceof aboa) {
                    aboaVar = new aboa(this, (aboa) abnyVar);
                } else {
                    throw new IllegalArgumentException("Unknown counter type: ".concat(String.valueOf(String.valueOf(abnyVar))));
                }
                map.put(str, aboaVar);
            }
            this.j.addAll(abojVar.j);
            abojVar.j.clear();
            abojVar.g = SystemClock.elapsedRealtime();
        } finally {
            writeLock.unlock();
        }
    }
}
