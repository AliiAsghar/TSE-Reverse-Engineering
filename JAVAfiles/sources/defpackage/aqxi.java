package defpackage;

import android.os.Trace;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqxi implements andy {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public aqxi(agvz agvzVar, ListenableFuture listenableFuture, ListenableFuture listenableFuture2, agvr agvrVar, int i) {
        this.e = i;
        this.d = listenableFuture;
        this.b = listenableFuture2;
        this.c = agvrVar;
        this.a = agvzVar;
    }

    @Override // defpackage.andy
    public final void a(Throwable th) {
        if (this.e != 0) {
            ((alvg) ((alvg) ((alvg) agvz.a.i()).g(th)).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerController$4", "onFailure", (char) 863, "EmojiPickerController.java")).q("Emoji picker data loading failed");
            return;
        }
        ((aqvr) this.a).a(Status.m.d(th).withDescription("Authorization future failed"), new aqut());
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [aqvs, java.lang.Object] */
    @Override // defpackage.andy
    public final /* synthetic */ void b(Object obj) {
        alog alogVar;
        if (this.e != 0) {
            ((alvg) ((alvg) agvz.a.d()).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerController$4", "onSuccess", 759, "EmojiPickerController.java")).q("Emoji picker data loading is done.");
            int i = alog.d;
            List<List> list = (List) agkx.i(this.d, alsx.a);
            alog alogVar2 = (alog) agkx.i(this.b, alsx.a);
            ((agvz) this.a).p.isPresent();
            alob alobVar = new alob();
            gvf.bd("ItemViewDataUtils.createEmojiViewData");
            agvz agvzVar = (agvz) this.a;
            boolean z = agvzVar.g;
            try {
                alob alobVar2 = new alob();
                int i2 = 0;
                for (List<agun> list2 : list) {
                    alob alobVar3 = new alob();
                    int i3 = 0;
                    for (agun agunVar : list2) {
                        int i4 = i3 + 1;
                        String str = agunVar.a;
                        if (agvzVar.f) {
                            alogVar = agunVar.b;
                        } else {
                            alogVar = alsx.a;
                        }
                        agvz agvzVar2 = agvzVar;
                        alob alobVar4 = alobVar3;
                        alobVar4.h(new agwn(i2, i3, str, alogVar, z));
                        alobVar3 = alobVar4;
                        i3 = i4;
                        agvzVar = agvzVar2;
                    }
                    alobVar2.h(alobVar3.g());
                    i2++;
                    agvzVar = agvzVar;
                }
                alog g = alobVar2.g();
                Trace.endSection();
                alobVar.j(g);
                list.size();
                ((agvz) this.a).k.isPresent();
                Object obj2 = this.c;
                alog g2 = alobVar.g();
                ((alvg) ((alvg) agwb.g.g()).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerCoreBodyAdapter", "updateEmojis", 373, "EmojiPickerCoreBodyAdapter.java")).o();
                agwb agwbVar = (agwb) obj2;
                agwbVar.n = new agww(g2, agwbVar.l, agwbVar.i);
                agwbVar.n.d(0, alogVar2);
                agwbVar.p();
                agvz agvzVar3 = (agvz) this.a;
                CharSequence charSequence = agvzVar3.d.g;
                if (agvzVar3.t && agvzVar3.u) {
                    agvzVar3.t = false;
                    agvzVar3.u = false;
                    ((agvz) this.a).c(alogVar2.isEmpty() ? 1 : 0, 2);
                    return;
                }
                return;
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        Status status = (Status) obj;
        if (!status.f()) {
            ((aqvr) this.a).a(status, new aqut());
            return;
        }
        Object obj3 = this.b;
        Object obj4 = this.a;
        try {
            aqyl aqylVar = (aqyl) obj3;
            aqylVar.d.set(this.d.a((aqvr) obj4, (aqut) this.c));
            aqylVar.m();
        } catch (RuntimeException e) {
            ((aqvr) obj4).a(Status.m.d(e).withDescription("Failed to start server call after authorization check"), new aqut());
        }
    }

    public aqxi(aqvr aqvrVar, aqyl aqylVar, aqut aqutVar, aqvs aqvsVar, int i) {
        this.e = i;
        this.a = aqvrVar;
        this.b = aqylVar;
        this.c = aqutVar;
        this.d = aqvsVar;
    }
}
