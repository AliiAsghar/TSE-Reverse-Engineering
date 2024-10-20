package defpackage;

import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Build;
import android.util.Pair;
import android.view.ContentInfo;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ecv {
    public final ect a;

    public ecv(ect ectVar) {
        this.a = ectVar;
    }

    static ClipData c(ClipDescription clipDescription, List list) {
        ClipData clipData = new ClipData(new ClipDescription(clipDescription), (ClipData.Item) list.get(0));
        for (int i = 1; i < list.size(); i++) {
            clipData.addItem((ClipData.Item) list.get(i));
        }
        return clipData;
    }

    public static ecv g(ContentInfo contentInfo) {
        return new ecv(new ecs(contentInfo));
    }

    public final int a() {
        return this.a.a();
    }

    public final int b() {
        return this.a.b();
    }

    public final ClipData d() {
        return this.a.c();
    }

    public final Pair e(eci eciVar) {
        Pair create;
        ecq ecrVar;
        ecq ecrVar2;
        ecv ecvVar;
        ClipData c = this.a.c();
        ecv ecvVar2 = null;
        if (c.getItemCount() == 1) {
            boolean a = eciVar.a(c.getItemAt(0));
            if (true != a) {
                ecvVar = null;
            } else {
                ecvVar = this;
            }
            if (true != a) {
                ecvVar2 = this;
            }
            return Pair.create(ecvVar, ecvVar2);
        }
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (int i = 0; i < c.getItemCount(); i++) {
            ClipData.Item itemAt = c.getItemAt(i);
            if (eciVar.a(itemAt)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(itemAt);
            } else {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(itemAt);
            }
        }
        if (arrayList == null) {
            create = Pair.create(null, c);
        } else if (arrayList2 == null) {
            create = Pair.create(c, null);
        } else {
            create = Pair.create(c(c.getDescription(), arrayList), c(c.getDescription(), arrayList2));
        }
        if (create.first == null) {
            return Pair.create(null, this);
        }
        if (create.second != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                ecrVar = new ecp(this);
            } else {
                ecrVar = new ecr(this);
            }
            dye.e((ClipData) create.first, ecrVar);
            ecv d = dye.d(ecrVar);
            if (Build.VERSION.SDK_INT >= 31) {
                ecrVar2 = new ecp(this);
            } else {
                ecrVar2 = new ecr(this);
            }
            dye.e((ClipData) create.second, ecrVar2);
            return Pair.create(d, dye.d(ecrVar2));
        }
        return Pair.create(this, null);
    }

    public final ContentInfo f() {
        ContentInfo f = this.a.f();
        f.getClass();
        return f;
    }

    public final String toString() {
        return this.a.toString();
    }
}
