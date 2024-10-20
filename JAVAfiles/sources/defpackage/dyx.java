package defpackage;

import android.app.Notification;
import android.app.Person;
import android.view.View;
import com.google.android.apps.messaging.R;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dyx {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Notification.Builder a(Notification.Builder builder, Person person) {
        Notification.Builder addPerson;
        addPerson = builder.addPerson(person);
        return addPerson;
    }

    public static /* synthetic */ List b(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            obj.getClass();
            arrayList.add(obj);
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static final enm c(View view) {
        enm enmVar;
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            if (tag instanceof enm) {
                enmVar = (enm) tag;
            } else {
                enmVar = null;
            }
            if (enmVar != null) {
                return enmVar;
            }
            Object parent = view.getParent();
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                view = null;
            }
        }
        return null;
    }

    public static final void d(View view, enm enmVar) {
        view.getClass();
        view.setTag(R.id.view_tree_lifecycle_owner, enmVar);
    }

    public static eor e(eov eovVar, artf artfVar, epd epdVar) {
        return eovVar.b(armd.d(artfVar), epdVar);
    }

    public static eor f() {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    public static eor g(eov eovVar, Class cls) {
        return eovVar.a(cls);
    }
}
