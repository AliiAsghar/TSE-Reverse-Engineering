package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.libraries.stickers.gallery.StickerGalleryActivity;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class airc {
    public final airb a;
    public final Handler b = new Handler(Looper.getMainLooper());
    public Runnable c;
    public String d;
    public final airg e;
    public final StickerGalleryActivity f;
    private ListenableFuture g;
    private final aiqj h;

    public airc(aiqj aiqjVar, airb airbVar, airg airgVar, StickerGalleryActivity stickerGalleryActivity) {
        this.h = aiqjVar;
        this.e = airgVar;
        this.a = airbVar;
        this.f = stickerGalleryActivity;
    }

    public final void a() {
        this.b.removeCallbacks(this.c);
        ListenableFuture listenableFuture = this.g;
        if (listenableFuture != null) {
            listenableFuture.cancel(true);
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final void b(aodc aodcVar) {
        ListenableFuture listenableFuture = this.g;
        if (listenableFuture != null) {
            listenableFuture.cancel(true);
        }
        if (TextUtils.isEmpty(this.d)) {
            this.a.m(Collections.emptyList());
            this.e.c();
            return;
        }
        airg airgVar = this.e;
        airgVar.f.setVisibility(0);
        airgVar.g.setVisibility(0);
        airgVar.h.setVisibility(8);
        airgVar.i.setVisibility(8);
        aiqj aiqjVar = this.h;
        String str = this.d;
        Object obj = aiqjVar.j;
        synchronized (((airl) obj).a) {
            if (((airl) obj).c == null) {
                airl.b();
            }
        }
        String a = ((airl) aiqjVar.j).a();
        ListenableFuture bN = albo.bN(new xpx(aiqjVar, str, 14), aiqjVar.b);
        albo.bR(bN, new vbr(aiqjVar, a, 12), aiqjVar.b);
        this.g = bN;
        albo.bR(bN, new adnx(this, 15), aiqk.a);
        aiqj aiqjVar2 = this.h;
        aozy createBuilder = aodd.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        ((aodd) apagVar).b = aode.a(21);
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        Object obj2 = aiqjVar2.g;
        ((aodd) createBuilder.b).e = aodcVar.a();
        ((airh) obj2).a((aodd) createBuilder.s());
    }
}
