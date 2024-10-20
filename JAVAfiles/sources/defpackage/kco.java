package defpackage;

import com.google.android.apps.messaging.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kco extends arrp implements arqg {
    final /* synthetic */ qkg[] a;
    final /* synthetic */ miz b;
    final /* synthetic */ aers c;
    final /* synthetic */ kcr d;
    final /* synthetic */ kcl e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kco(qkg[] qkgVarArr, miz mizVar, aers aersVar, kcr kcrVar, kcl kclVar) {
        super(0);
        this.a = qkgVarArr;
        this.b = mizVar;
        this.c = aersVar;
        this.d = kcrVar;
        this.e = kclVar;
    }

    @Override // defpackage.arqg
    public final Object a() {
        aezf aezfVar;
        boolean z;
        ArrayList arrayList = new ArrayList(3);
        int i = 0;
        while (true) {
            aezfVar = null;
            Object obj = null;
            if (i >= 3) {
                break;
            }
            qkg qkgVar = this.a[i];
            if (qkgVar != null) {
                obj = qkgVar.b();
            }
            arrayList.add(obj);
            i++;
        }
        Object[] array = arrayList.toArray(new Object[0]);
        Object obj2 = array[0];
        Object obj3 = array[1];
        boolean booleanValue = ((Boolean) array[2]).booleanValue();
        aezf aezfVar2 = (aezf) obj3;
        aeve aeveVar = (aeve) obj2;
        alvw d = kcr.a.d();
        d.X(alwp.a, "BugleImage");
        ((alvg) d.h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/image/ImageBubbleUiAdapter$getDisplayableUiData$$inlined$combineInitialValuedFlow$1", "invoke", 408, "ImageBubbleUiAdapter.kt")).D("Image bubble with messageId = %s is in %s state", this.b.b().a(), this.c.g);
        kcr kcrVar = this.d;
        if (kcrVar.k.a() && booleanValue) {
            kdh kdhVar = (kdh) this.d.g.b();
            kde kdeVar = new kde(this.b);
            kcr kcrVar2 = this.d;
            aeveVar = kdhVar.b(kdeVar, kcrVar2.b.getString(R.string.message_bubble_save_to_device), new kbp(kcrVar2, this.b, 8));
        }
        if (aezfVar2 != null) {
            aezfVar = aezf.h(aezfVar2, null, null, null, null, null, true, 2031615);
        }
        aezf aezfVar3 = aezfVar;
        if (this.d.k.a() && booleanValue) {
            z = true;
        } else {
            z = false;
        }
        return kcrVar.a(aers.s(this.c, aeveVar, null, null, null, z, aezfVar3, null, null, 490975), this.e);
    }
}
