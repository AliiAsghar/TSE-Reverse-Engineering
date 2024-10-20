package defpackage;

import com.google.android.apps.messaging.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kcp extends arpw implements arqw {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ qkg[] c;
    final /* synthetic */ miz d;
    final /* synthetic */ aers e;
    final /* synthetic */ kcr f;
    final /* synthetic */ kcl g;
    private /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kcp(arpe arpeVar, qkg[] qkgVarArr, miz mizVar, aers aersVar, kcr kcrVar, kcl kclVar) {
        super(3, arpeVar);
        this.c = qkgVarArr;
        this.d = mizVar;
        this.e = aersVar;
        this.f = kcrVar;
        this.g = kclVar;
    }

    @Override // defpackage.arqw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        kcp kcpVar = new kcp((arpe) obj3, this.c, this.d, this.e, this.f, this.g);
        kcpVar.h = (asaj) obj;
        kcpVar.b = (Object[]) obj2;
        return kcpVar.b(arnb.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v1, types: [asaj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v8 */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        aezf aezfVar;
        boolean z;
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            ?? r2 = this.h;
            Object obj2 = this.b;
            qkg[] qkgVarArr = this.c;
            ArrayList arrayList = new ArrayList(3);
            int i2 = 0;
            int i3 = 0;
            while (true) {
                aezfVar = null;
                if (i2 >= 3) {
                    break;
                }
                if (qkgVarArr[i2] != null) {
                    aezfVar = ((Object[]) obj2)[i3];
                    i3++;
                }
                arrayList.add(aezfVar);
                i2++;
            }
            Object[] array = arrayList.toArray(new Object[0]);
            Object obj3 = array[0];
            Object obj4 = array[1];
            boolean booleanValue = ((Boolean) array[2]).booleanValue();
            aezf aezfVar2 = (aezf) obj4;
            aeve aeveVar = (aeve) obj3;
            alvw d = kcr.a.d();
            d.X(alwp.a, "BugleImage");
            ((alvg) d.h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/image/ImageBubbleUiAdapter$getDisplayableUiData$$inlined$combineInitialValuedFlow$2$3", "invokeSuspend", 408, "ImageBubbleUiAdapter.kt")).D("Image bubble with messageId = %s is in %s state", this.d.b().a(), this.e.g);
            kcr kcrVar = this.f;
            if (kcrVar.k.a() && booleanValue) {
                kdh kdhVar = (kdh) this.f.g.b();
                kde kdeVar = new kde(this.d);
                kcr kcrVar2 = this.f;
                aeveVar = kdhVar.b(kdeVar, kcrVar2.b.getString(R.string.message_bubble_save_to_device), new kbp(kcrVar2, this.d, 8));
            }
            if (aezfVar2 != null) {
                aezfVar = aezf.h(aezfVar2, null, null, null, null, null, true, 2031615);
            }
            aezf aezfVar3 = aezfVar;
            if (this.f.k.a() && booleanValue) {
                z = true;
            } else {
                z = false;
            }
            aerq a = kcrVar.a(aers.s(this.e, aeveVar, null, null, null, z, aezfVar3, null, null, 490975), this.g);
            this.a = 1;
            if (r2.fv(a, this) == arplVar) {
                return arplVar;
            }
        }
        return arnb.a;
    }
}
