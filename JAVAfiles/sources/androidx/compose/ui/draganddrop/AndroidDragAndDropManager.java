package androidx.compose.ui.draganddrop;

import android.view.DragEvent;
import android.view.View;
import defpackage.arrx;
import defpackage.cga;
import defpackage.cgs;
import defpackage.cgu;
import defpackage.cgv;
import defpackage.cgw;
import defpackage.cgx;
import defpackage.cgy;
import defpackage.cyg;
import defpackage.tn;
import defpackage.to;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class AndroidDragAndDropManager implements View.OnDragListener {
    public final cgw a = new cgw(null);
    public final to b = new to((byte[]) null);
    public final cga c = new cyg<cgw>() { // from class: androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1
        @Override // defpackage.cyg
        public final /* bridge */ /* synthetic */ cga.c d() {
            return AndroidDragAndDropManager.this.a;
        }

        @Override // defpackage.cyg
        public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return AndroidDragAndDropManager.this.a.hashCode();
        }
    };

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        cgs cgsVar = new cgs(dragEvent);
        boolean z = false;
        switch (dragEvent.getAction()) {
            case 1:
                cgw cgwVar = this.a;
                arrx arrxVar = new arrx();
                cgx.b(cgwVar, new cgu(arrxVar));
                z = arrxVar.a;
                tn tnVar = new tn(this.b);
                while (tnVar.hasNext()) {
                    ((cgy) tnVar.next()).e();
                }
                return z;
            case 2:
                this.a.d(cgsVar);
                return false;
            case 3:
                return false;
            case 4:
                cgx.b(this.a, new cgv());
                this.b.clear();
                return false;
            case 5:
                return false;
            case 6:
                this.a.a(cgsVar);
                return false;
            default:
                return z;
        }
    }
}
