package defpackage;

import android.widget.Button;
import android.widget.SearchView;
import com.google.android.apps.messaging.ui.debug.DebugGServiceKeysFragment;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aajl implements SearchView.OnQueryTextListener {
    final /* synthetic */ DebugGServiceKeysFragment a;

    public aajl(DebugGServiceKeysFragment debugGServiceKeysFragment) {
        this.a = debugGServiceKeysFragment;
    }

    @Override // android.widget.SearchView.OnQueryTextListener
    public final boolean onQueryTextChange(String str) {
        int i;
        Button button = this.a.ag;
        if (str.length() > 0) {
            i = 8;
        } else {
            i = 0;
        }
        button.setVisibility(i);
        aajn aajnVar = this.a.ai;
        str.getClass();
        List list = aajnVar.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (arsd.O((String) obj, str)) {
                arrayList.add(obj);
            }
        }
        aajm aajmVar = this.a.d;
        aajmVar.a = alog.n(arrayList);
        aajmVar.notifyDataSetChanged();
        return true;
    }

    @Override // android.widget.SearchView.OnQueryTextListener
    public final boolean onQueryTextSubmit(String str) {
        return false;
    }
}
