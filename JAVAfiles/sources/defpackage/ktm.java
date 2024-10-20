package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.helpandfeedback.advancedfeedback.ui.AdvancedFeedbackDataView;
import com.google.android.apps.messaging.ui.animation.illustration.IllustrationViewStub;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ktm implements Consumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ktm(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List, java.lang.Object] */
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        int i = 2;
        switch (this.b) {
            case 0:
                Collection.EL.stream(((ksy) obj).a).forEach(new ktm(this.a, i));
                return;
            case 1:
                ((Intent) this.a).putExtra("advanced_feedback_throwable_string_key", ajro.t((Throwable) obj));
                return;
            case 2:
                this.a.add(((ksx) obj).c);
                return;
            case 3:
                ((ksk) this.a).e = (Bitmap) obj;
                return;
            case 4:
                Object obj2 = ((AdvancedFeedbackDataView) obj).f().get();
                ksk kskVar = (ksk) this.a;
                if (kskVar.a == null) {
                    kskVar.a = new alob();
                }
                kskVar.a.h(obj2);
                return;
            case 5:
                ((ksw) this.a).b(((kuf) obj).e);
                return;
            case 6:
                this.a.add((aaox) obj);
                return;
            case 7:
                this.a.add((kpc) obj);
                return;
            case 8:
                kvw kvwVar = (kvw) this.a;
                kyx kyxVar = (kyx) obj;
                kyxVar.a();
                kvwVar.b.a.c(kyxVar);
                return;
            case 9:
                this.a.add((kqe) obj);
                return;
            case 10:
                akfb a = ((laq) obj).a();
                kvw kvwVar2 = (kvw) this.a;
                kvwVar2.bp.C(a, new kvz(kvwVar2));
                return;
            case 11:
                this.a.add((ihp) obj);
                return;
            case 12:
                kvk kvkVar = (kvk) this.a;
                kwv kwvVar = (kwv) obj;
                int L = kvkVar.b.aI.L();
                if (L != 0 && L != -1) {
                    kvw kvwVar3 = kvkVar.b;
                    if (kvwVar3.d(kvwVar3.b) == null) {
                        if (((ohs) kvkVar.b.bi.b()).a()) {
                            kvkVar.b.e(kwvVar);
                        } else {
                            kvw kvwVar4 = kvkVar.b;
                            kvwVar4.aK = kvwVar4.e(kwvVar);
                        }
                    }
                    kvw kvwVar5 = kvkVar.b;
                    kvwVar5.d(kvwVar5.b).setVisibility(0);
                    return;
                }
                kvw kvwVar6 = kvkVar.b;
                if (kvwVar6.d(kvwVar6.b) != null) {
                    kvw kvwVar7 = kvkVar.b;
                    kvwVar7.d(kvwVar7.b).setVisibility(8);
                    return;
                }
                return;
            case 13:
                this.a.a(obj);
                return;
            case 14:
                this.a.a(obj);
                return;
            case 15:
                this.a.a(obj);
                return;
            case 16:
                lfd lfdVar = (lfd) obj;
                kxg kxgVar = (kxg) this.a;
                if (kxgVar.c == null) {
                    kxgVar.b.f(lfdVar.a().b());
                    kxgVar.c = (IllustrationViewStub) ((FrameLayout) kxgVar.b.b()).findViewById(lfdVar.a().a());
                }
                kxgVar.c.c().requestLayout();
                kxgVar.b.g(0);
                return;
            case 17:
                if (((aqby) obj).b == 2) {
                    ((kyt) this.a).a.setContentSensitivity(1);
                    return;
                }
                return;
            case 18:
                this.a.a(obj);
                return;
            case 19:
                this.a.a(obj);
                return;
            default:
                this.a.a(obj);
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.b) {
            case 0:
                return Consumer$CC.$default$andThen(this, consumer);
            case 1:
                return Consumer$CC.$default$andThen(this, consumer);
            case 2:
                return Consumer$CC.$default$andThen(this, consumer);
            case 3:
                return Consumer$CC.$default$andThen(this, consumer);
            case 4:
                return Consumer$CC.$default$andThen(this, consumer);
            case 5:
                return Consumer$CC.$default$andThen(this, consumer);
            case 6:
                return Consumer$CC.$default$andThen(this, consumer);
            case 7:
                return Consumer$CC.$default$andThen(this, consumer);
            case 8:
                return Consumer$CC.$default$andThen(this, consumer);
            case 9:
                return Consumer$CC.$default$andThen(this, consumer);
            case 10:
                return Consumer$CC.$default$andThen(this, consumer);
            case 11:
                return Consumer$CC.$default$andThen(this, consumer);
            case 12:
                return Consumer$CC.$default$andThen(this, consumer);
            case 13:
                return Consumer$CC.$default$andThen(this, consumer);
            case 14:
                return Consumer$CC.$default$andThen(this, consumer);
            case 15:
                return Consumer$CC.$default$andThen(this, consumer);
            case 16:
                return Consumer$CC.$default$andThen(this, consumer);
            case 17:
                return Consumer$CC.$default$andThen(this, consumer);
            case 18:
                return Consumer$CC.$default$andThen(this, consumer);
            case 19:
                return Consumer$CC.$default$andThen(this, consumer);
            default:
                return Consumer$CC.$default$andThen(this, consumer);
        }
    }
}
