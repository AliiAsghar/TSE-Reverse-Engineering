package defpackage;

import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eej {
    public static final ArrayList a = new ArrayList();
    public WeakHashMap b = null;
    private SparseArray d = null;
    public WeakReference c = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static eej c(View view) {
        eej eejVar = (eej) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (eejVar == null) {
            eej eejVar2 = new eej();
            view.setTag(R.id.tag_unhandled_key_event_manager, eejVar2);
            return eejVar2;
        }
        return eejVar;
    }

    public static final boolean d(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList != null) {
            int size = arrayList.size();
            do {
                size--;
                if (size < 0) {
                    return false;
                }
            } while (!((eei) arrayList.get(size)).a());
            return true;
        }
        return false;
    }

    public final SparseArray a() {
        if (this.d == null) {
            this.d = new SparseArray();
        }
        return this.d;
    }

    public final View b(View view, KeyEvent keyEvent) {
        View b;
        WeakHashMap weakHashMap = this.b;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                do {
                    childCount--;
                    if (childCount >= 0) {
                        b = b(viewGroup.getChildAt(childCount), keyEvent);
                    }
                } while (b == null);
                return b;
            }
            if (d(view)) {
                return view;
            }
        }
        return null;
    }
}
