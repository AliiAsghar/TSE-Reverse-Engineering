package defpackage;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import com.google.android.apps.messaging.ui.debug.DebugMmsConfigFragment;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aalh implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public aalh(DebugMmsConfigFragment debugMmsConfigFragment, Integer[] numArr, int i) {
        this.c = i;
        this.a = numArr;
        this.b = debugMmsConfigFragment;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.function.Consumer, java.lang.Object] */
    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (this.c != 0) {
            int intValue = ((Integer[]) this.a)[i].intValue();
            DebugMmsConfigFragment debugMmsConfigFragment = (DebugMmsConfigFragment) this.b;
            debugMmsConfigFragment.c = intValue;
            debugMmsConfigFragment.a();
            return;
        }
        ykb ykbVar = (ykb) ((ArrayAdapter) this.b).getItem(i);
        ykbVar.getClass();
        this.a.accept(ykbVar);
    }

    public aalh(Consumer consumer, ArrayAdapter arrayAdapter, int i) {
        this.c = i;
        this.a = consumer;
        this.b = arrayAdapter;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
