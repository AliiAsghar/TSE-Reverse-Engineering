package defpackage;

import com.google.android.apps.messaging.ui.mediapicker.c2o.ContentGridView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.AttachmentQueueState;
import com.google.android.apps.messaging.ui.mediapicker.c2o.customization.CustomizationModel;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaqq {
    public aapk a;
    public aapf b;
    public ContentGridView c;
    private final cg d;
    private final AttachmentQueueState e;
    private final aabz f;
    private final aaqt g;
    private final rre h;
    private final Boolean i;
    private final alor j;
    private final ykw k;
    private final aabp l;

    public aaqq(alor alorVar, ykw ykwVar, cg cgVar, Boolean bool, rre rreVar, aabp aabpVar, AttachmentQueueState attachmentQueueState, ContentGridView contentGridView, aabz aabzVar, aapf aapfVar, aaqt aaqtVar, aapk aapkVar) {
        this.j = alorVar;
        this.d = cgVar;
        this.l = aabpVar;
        this.e = attachmentQueueState;
        this.c = contentGridView;
        this.f = aabzVar;
        this.h = rreVar;
        this.i = bool;
        this.b = aapfVar;
        this.g = aaqtVar;
        this.a = aapkVar;
        this.k = ykwVar;
    }

    public final aaqd a(apel apelVar, int i) {
        aaqs aaqsVar = (aaqs) this.j.get(apelVar);
        aaqsVar.getClass();
        ContentGridView contentGridView = this.c;
        aapk aapkVar = this.a;
        aapf aapfVar = this.b;
        return aaqsVar.a(new aaqu(this.d, this.e, this.l, contentGridView, aapkVar, this.h, this.g, aapfVar, this.f, i));
    }

    public final List b(CustomizationModel customizationModel, boolean z) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < customizationModel.a(); i2++) {
            apem b = customizationModel.b(i2);
            apel b2 = apel.b(b.b);
            if (b2 == null) {
                b2 = apel.UNRECOGNIZED;
            }
            apen b3 = apen.b(b.c);
            if (b3 == null) {
                b3 = apen.UNRECOGNIZED;
            }
            boolean e = CustomizationModel.e(this.k, b2, this.i, z);
            customizationModel.d(i2, e);
            if (e && b3 != apen.INVISIBLE) {
                aaqd a = a(b2, i);
                customizationModel.d(i2, true);
                arrayList.add(a);
                i++;
            }
        }
        return arrayList;
    }
}
