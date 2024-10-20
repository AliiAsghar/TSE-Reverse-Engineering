package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kel extends arpw implements arqv {
    int a;
    final /* synthetic */ ken b;
    final /* synthetic */ Uri c;
    final /* synthetic */ String d;
    final /* synthetic */ long e;
    final /* synthetic */ boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kel(ken kenVar, Uri uri, String str, long j, boolean z, arpe arpeVar) {
        super(2, arpeVar);
        this.b = kenVar;
        this.c = uri;
        this.d = str;
        this.e = j;
        this.f = z;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((kel) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            ken kenVar = this.b;
            lmv lmvVar = new lmv(this.c, this.d, this.e, this.f);
            this.a = 1;
            obj = kenVar.m.a(lmvVar, this);
            if (obj == arplVar) {
                return arplVar;
            }
        }
        loq loqVar = (loq) obj;
        ((alvg) ken.a.g().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/video2/VideoBubbleUiAdapter$openVideo$1", "invokeSuspend", 379, "VideoBubbleUiAdapter.kt")).t("Video bubble MediaViewer result: %s", loqVar);
        if (loqVar != null) {
            this.b.a(loqVar);
        }
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new kel(this.b, this.c, this.d, this.e, this.f, arpeVar);
    }
}
