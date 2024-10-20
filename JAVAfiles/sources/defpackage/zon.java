package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zon implements hh {
    final /* synthetic */ zos a;
    final /* synthetic */ lbh b;
    final /* synthetic */ zop c;

    public zon(zop zopVar, zos zosVar, lbh lbhVar) {
        this.a = zosVar;
        this.b = lbhVar;
        this.c = zopVar;
    }

    @Override // defpackage.hh
    public final void a(int i, int i2, Object obj) {
        for (int i3 = i; i3 < i + i2; i3++) {
            if (i3 == this.a.c) {
                lbh lbhVar = this.b;
                this.c.b.getChildAt(i3);
                alog alogVar = this.a.b;
                lbhVar.a().b();
            } else {
                zpa zpaVar = (zpa) this.c.b.getChildAt(i3);
                MessagePartCoreData messagePartCoreData = (MessagePartCoreData) this.a.a.get(Integer.valueOf(i3));
                messagePartCoreData.getClass();
                zpaVar.a(messagePartCoreData);
                zpaVar.b();
            }
        }
    }

    @Override // defpackage.hh
    public final void b(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            if (i3 == this.a.c) {
                lbh lbhVar = this.b;
                zop zopVar = this.c;
                lbg b = lbhVar.b();
                zopVar.c(b.a());
                zop zopVar2 = this.c;
                zopVar2.b.addView(b.a());
                alog alogVar = this.a.b;
                b.b();
            } else {
                zop zopVar3 = this.c;
                zpa zpaVar = new zpa(zopVar3.r, zopVar3, zopVar3, (xum) zopVar3.v.b(), (aksr) this.c.w.b());
                MessagePartCoreData messagePartCoreData = (MessagePartCoreData) this.a.a.get(Integer.valueOf(i3));
                messagePartCoreData.getClass();
                this.c.c(zpaVar);
                this.c.b.addView(zpaVar);
                zpaVar.a(messagePartCoreData);
                zpaVar.b();
            }
        }
    }

    @Override // defpackage.hh
    public final void c(int i, int i2) {
        LinearLayout linearLayout = this.c.b;
        View childAt = linearLayout.getChildAt(i);
        linearLayout.removeViewsInLayout(i, 1);
        this.c.b.addView(childAt, i2);
    }

    @Override // defpackage.hh
    public final void d(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            zop zopVar = this.c;
            zopVar.d(zopVar.b.getChildAt(i3));
        }
    }
}
