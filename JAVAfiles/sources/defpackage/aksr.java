package defpackage;

import android.util.StateSet;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aksr {
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public aksr(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        this.a = i;
        this.c = iArr;
        this.d = iArr2;
        this.b = iArr3;
    }

    public static aksr j(ahjm ahjmVar, Throwable th) {
        return new aksr(ahjmVar, -1, th.getMessage(), th);
    }

    public final akrc a(Class cls, String str) {
        return b(cls.getSimpleName() + ": " + str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final akrc b(String str) {
        return ((akte) this.d).e(str, (akrl) this.b.b(), this.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final akrc c(String str, akrl akrlVar) {
        return ((akte) this.d).e(str, akrl.e((akrl) this.b.b(), akrlVar), this.a);
    }

    public final akrc d(String str) {
        return c(str, akrk.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final akrc e(long j, long j2) {
        Object b = this.b.b();
        akry c = akqj.c();
        akte.c(c, "Application creation");
        akry d = ((akte) this.d).d("Application creation", (akrl) b, j, j2, 1, this.a);
        if (c == ((akrb) d).b) {
            return d;
        }
        return new aktc(d, c, 0);
    }

    public final aksa f(String str) {
        if (!akqj.u()) {
            return g(str, akrk.a);
        }
        return new akqh(6);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final akrx g(String str, akrl akrlVar) {
        akrl e = akrl.e((akrl) this.b.b(), akrlVar);
        akry c = akqj.c();
        akte.c(c, str);
        akte akteVar = (akte) this.d;
        return new aktd(new akrh(akteVar.d(str, e, akteVar.b.f().toEpochMilli(), akteVar.b.b(), 2, this.a), false), c);
    }

    public final int h(int[] iArr) {
        for (int i = 0; i < this.a; i++) {
            if (StateSet.stateSetMatches(((int[][]) this.b)[i], iArr)) {
                return i;
            }
        }
        return -1;
    }

    public final MessageCoreData i() {
        return (MessageCoreData) ((AtomicReference) this.b).get();
    }

    public aksr(ahjm ahjmVar, int i, String str, Throwable th) {
        this.d = ahjmVar;
        this.a = i;
        this.c = str;
        this.b = th;
    }

    public aksr(ajli ajliVar) {
        this.a = ajliVar.a;
        this.c = ajliVar.b;
        this.b = ajliVar.c;
        this.d = ajliVar.d;
    }

    public aksr(String str, int i, String str2, Set set) {
        this.a = i;
        this.c = str;
        this.d = str2;
        this.b = set;
    }

    public aksr(akte akteVar, armf armfVar, Set set) {
        this.d = akteVar;
        this.c = akrl.d(set);
        this.b = new vhf(this, armfVar, 11);
        this.a = 2;
    }

    public aksr(pyz pyzVar, MessageCoreData messageCoreData, int i) {
        this.d = pyzVar;
        this.c = messageCoreData;
        this.a = i;
        AtomicReference atomicReference = new AtomicReference(null);
        this.b = atomicReference;
        atomicReference.set(messageCoreData);
    }

    public aksr(int i, asqc asqcVar, Executor executor) {
        this.a = i;
        this.b = asqcVar;
        this.d = executor;
        this.c = new ConcurrentHashMap(8);
    }
}
