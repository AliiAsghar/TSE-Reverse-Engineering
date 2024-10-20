package defpackage;

import android.graphics.Bitmap;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agvw implements andy {
    final /* synthetic */ int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public agvw(Object obj, Object obj2, int i, int i2) {
        this.d = i2;
        this.b = obj2;
        this.a = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [agxa, java.lang.Object] */
    @Override // defpackage.andy
    public final void a(Throwable th) {
        if (this.d != 0) {
            if (th instanceof abra) {
                if (((leh) this.c).b) {
                    return;
                }
                lek.a.n("Failed to get photo for place by calling GetPhotoForPlace", th);
                return;
            }
            throw new alia(th);
        }
        ((alvg) ((alvg) ((alvg) agvz.a.i()).g(th)).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerController$5", "onFailure", 956, "EmojiPickerController.java")).r("Emoji picker pageable data loading page %d failed.", this.a);
        agvr d = ((agvz) this.c).d();
        int i = agwp.c;
        agvz agvzVar = (agvz) this.c;
        agvzVar.d().F(agvzVar.q);
        this.b.h();
        boolean z = d.e;
        ((agvz) this.c).n.set(false);
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [agxa, java.lang.Object] */
    @Override // defpackage.andy
    public final /* synthetic */ void b(Object obj) {
        if (this.d != 0) {
            Optional optional = (Optional) obj;
            if (((leh) this.c).b) {
                return;
            }
            synchronized (lek.b) {
                aaue aaueVar = (aaue) ((leh) this.c).a.c.get();
                if (optional.isPresent() && aaueVar != null) {
                    xzw.a.post(new mib(aaueVar, this.b, (Bitmap) optional.get(), this.a, 6, null));
                }
            }
            return;
        }
        alog alogVar = (alog) obj;
        ((alvg) ((alvg) agvz.a.g()).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerController$5", "onSuccess", 946, "EmojiPickerController.java")).r("Emoji picker pageable data loaded %d items.", alogVar.size());
        agvz agvzVar = (agvz) this.c;
        agvr d = agvzVar.d();
        agvzVar.r++;
        ?? r2 = this.b;
        if (r2.f()) {
            alob alobVar = new alob();
            alobVar.j(alogVar);
            alobVar.h(agxo.a);
            alogVar = alobVar.g();
        } else if (alogVar.isEmpty()) {
            String d2 = r2.d();
            d2.getClass();
            alogVar = alog.r(new agxn(d2));
        }
        aglo.y(agvzVar.m, alogVar, agvzVar.q, agvzVar.s, agvzVar.g, agvzVar.f, -1);
        boolean z = d.e;
        ((agvz) this.c).n.set(false);
    }
}
