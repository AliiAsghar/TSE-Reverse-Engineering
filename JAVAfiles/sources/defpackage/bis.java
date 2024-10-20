package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bis extends ViewGroup {
    private final int a;
    private final List b;
    private final List c;
    private final biu d;
    private int e;

    public bis(Context context) {
        super(context);
        this.a = 5;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.c = arrayList2;
        this.d = new biu();
        setClipChildren(false);
        biw biwVar = new biw(context);
        addView(biwVar);
        arrayList.add(biwVar);
        arrayList2.add(biwVar);
        this.e = 1;
        setTag(R.id.hide_in_inspector_tag, true);
    }

    public final biw a(bit bitVar) {
        Object remove;
        biw a = this.d.a(bitVar);
        if (a != null) {
            return a;
        }
        List list = this.c;
        list.getClass();
        if (list.isEmpty()) {
            remove = null;
        } else {
            remove = list.remove(0);
        }
        biw biwVar = (biw) remove;
        if (biwVar == null) {
            if (this.e > aqjn.z(this.b)) {
                biwVar = new biw(getContext());
                addView(biwVar);
                this.b.add(biwVar);
            } else {
                biwVar = (biw) this.b.get(this.e);
                bit bitVar2 = (bit) this.d.b.get(biwVar);
                if (bitVar2 != null) {
                    bitVar2.b();
                    this.d.b(bitVar2);
                    biwVar.b();
                }
            }
            int i = this.e;
            if (i < this.a - 1) {
                this.e = i + 1;
            } else {
                this.e = 0;
            }
        }
        biu biuVar = this.d;
        biuVar.a.put(bitVar, biwVar);
        biuVar.b.put(biwVar, bitVar);
        return biwVar;
    }

    public final void b(bit bitVar) {
        bitVar.b();
        biw a = this.d.a(bitVar);
        if (a != null) {
            a.b();
            this.d.b(bitVar);
            this.c.add(a);
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
