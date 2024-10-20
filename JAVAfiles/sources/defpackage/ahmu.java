package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahmu {
    public final ahms a;
    public final armf b;
    public final ahrr c;
    public final armf d;
    public final algw e;
    public final algw f;
    public final algw g;
    public final armf h;
    private final ahkj i;
    private final Executor j;

    /* JADX WARN: Type inference failed for: r3v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [armf, java.lang.Object] */
    public ahmu(ahms ahmsVar, armf armfVar, ahkj ahkjVar, adec adecVar, armf armfVar2, algw algwVar, algw algwVar2, algw algwVar3, armf armfVar3, Executor executor, apwt apwtVar, armf armfVar4) {
        this.a = ahmsVar;
        this.i = ahkjVar;
        this.b = armfVar;
        this.j = executor;
        this.d = new acss(armfVar2, 6);
        Context context = (Context) adecVar.a.b();
        context.getClass();
        Executor executor2 = (Executor) adecVar.c.b();
        executor2.getClass();
        ahru ahruVar = (ahru) adecVar.d.b();
        ahruVar.getClass();
        Boolean bool = (Boolean) adecVar.e.b();
        bool.getClass();
        this.c = new ahrr(context, executor2, ahruVar, apwtVar, bool.booleanValue(), (algw) ((apxx) adecVar.b).a, armfVar4);
        this.e = algwVar;
        this.f = algwVar2;
        this.g = algwVar3;
        this.h = armfVar3;
    }

    public final long a(String str) {
        if (this.i.a) {
            return -1L;
        }
        ahrr ahrrVar = this.c;
        if (ahrrVar.c.c()) {
            return -1L;
        }
        boolean z = ahrrVar.b;
        ahrv ahrvVar = ahrrVar.a;
        if (!z) {
            return -1L;
        }
        return ahrvVar.a(str);
    }

    public final ListenableFuture b(final ahmr ahmrVar) {
        if (this.i.a) {
            return albo.bG();
        }
        return albo.bN(new ancr() { // from class: ahmt
            /* JADX WARN: Can't wrap try/catch for region: R(15:232|(2:233|234)|(4:236|(1:238)|239|(4:241|242|252|249))|253|254|(3:263|264|(15:266|(1:268)|269|(1:271)(9:280|(5:283|(1:287)|288|289|281)|290|(1:304)(3:294|295|296)|297|(1:299)|300|(1:302)|303)|272|(2:275|276)|274|257|258|259|260|(1:262)|242|252|249))|256|257|258|259|260|(0)|242|252|249) */
            /* JADX WARN: Code restructure failed: missing block: B:244:0x0722, code lost:
            
                r0 = e;
             */
            /* JADX WARN: Code restructure failed: missing block: B:247:0x0740, code lost:
            
                r8 = r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:250:0x0742, code lost:
            
                r8.addSuppressed(r0);
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:247:0x0740  */
            /* JADX WARN: Removed duplicated region for block: B:250:0x0742  */
            /* JADX WARN: Removed duplicated region for block: B:262:0x0712 A[Catch: RuntimeException -> 0x0722, TryCatch #1 {RuntimeException -> 0x0722, blocks: (B:242:0x071e, B:260:0x0700, B:262:0x0712), top: B:259:0x0700 }] */
            /* JADX WARN: Type inference failed for: r0v3, types: [alhr, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r6v32, types: [alhr, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r9v15, types: [alhr, java.lang.Object] */
            @Override // defpackage.ancr
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final com.google.common.util.concurrent.ListenableFuture a() {
                /*
                    Method dump skipped, instructions count: 1896
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ahmt.a():com.google.common.util.concurrent.ListenableFuture");
            }
        }, this.j);
    }

    public final boolean c(String str) {
        if (a(str) != -1) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        ahrr ahrrVar = this.c;
        boolean z = ahrrVar.b;
        ahrv ahrvVar = ahrrVar.a;
        if (z && ahrvVar.d()) {
            return true;
        }
        return false;
    }
}
