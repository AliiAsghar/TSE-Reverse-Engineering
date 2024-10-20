package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.google.android.rcs.client.messaging.CreateGroupRequest;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adec {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public adec(acrh acrhVar) {
        this.b = this;
        this.a = acrhVar;
        this.e = new adao(this, 0, 3);
        this.d = new adao(this, 1, 3);
        this.c = new adao(this, 2, 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [armf, java.lang.Object] */
    public final adeb a(CreateGroupRequest createGroupRequest) {
        createGroupRequest.getClass();
        return new adeb(createGroupRequest, (Context) this.a.b(), (ajtk) this.b.b(), (aniz) this.c.b(), (armf) this.d, (anen) this.e.b(), 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [byn, java.lang.Object] */
    public final void b(Bitmap bitmap) {
        this.e.h(bitmap);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [byn, java.lang.Object] */
    public final void c(String str) {
        this.c.h(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final ListenableFuture d(String str) {
        ahiu.f("%s: submitting check for in-progress download future with key: %s", "DownloadFutureMap", str);
        Object obj = this.b;
        ahes ahesVar = new ahes(obj, str, 2);
        aiim aiimVar = (aiim) obj;
        return aktp.Z(((adwv) aiimVar.a).c(ahesVar, aiimVar.c), new ahsi(this, str, 1), this.d);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final void e(String str) {
        ahiu.c("%s: CancelForegroundDownload for Uri = %s", "DownloaderImp", str);
        aktp.Z(d(str), new ahce(str, 2), this.d);
    }

    public final void f() {
        ((agdq) this.c).c.setOnHierarchyChangeListener(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, arqr] */
    public final void g() {
        f();
        if (((agdq) this.c).h) {
            h(this.e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, arqr] */
    public final void h(arqr arqrVar) {
        aruj arujVar = new aruj((artt) arrn.j(new een(((agdq) this.c).c, 1), this.d), 1);
        while (arujVar.hasNext()) {
            arqrVar.a((View) arujVar.next());
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [cas, java.lang.Object] */
    public final adom i() {
        return (adom) this.a.a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [byn, java.lang.Object] */
    public final void j(adom adomVar) {
        this.b.h(adomVar);
    }

    @armg
    public adec(agdq agdqVar, arqr arqrVar, arqr arqrVar2, arqr arqrVar3) {
        this.c = agdqVar;
        this.b = arqrVar;
        this.e = arqrVar2;
        this.d = arqrVar3;
        this.a = new afwp(this, 2);
    }

    public adec(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5) {
        this.a = armfVar;
        this.b = armfVar2;
        this.c = armfVar3;
        this.d = armfVar4;
        this.e = armfVar5;
    }

    public adec(adom adomVar) {
        this.a = new byu(adomVar, cav.a);
        this.b = new byu(afcc.a, cav.a);
        this.c = new byu(null, cav.a);
        this.e = new byu(null, cav.a);
        this.d = new cez();
    }

    public adec(Context context, algw algwVar, Executor executor, algw algwVar2, alhr alhrVar) {
        this.d = executor;
        this.e = algwVar2;
        this.c = alhrVar;
        this.a = new aiim(executor, new ahiv());
        this.b = new aiim(executor, new ahje(algwVar, context));
    }

    public adec(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, char[] cArr) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.c = armfVar2;
        armfVar3.getClass();
        this.d = armfVar3;
        armfVar4.getClass();
        this.e = armfVar4;
        armfVar5.getClass();
        this.b = armfVar5;
    }

    public adec(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, byte[] bArr) {
        armfVar.getClass();
        this.b = armfVar;
        armfVar2.getClass();
        this.e = armfVar2;
        armfVar3.getClass();
        this.d = armfVar3;
        armfVar4.getClass();
        this.a = armfVar4;
        armfVar5.getClass();
        this.c = armfVar5;
    }

    public adec(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, byte[] bArr, byte[] bArr2) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.c = armfVar2;
        armfVar3.getClass();
        this.b = armfVar3;
        armfVar4.getClass();
        this.e = armfVar4;
        armfVar5.getClass();
        this.d = armfVar5;
    }
}
