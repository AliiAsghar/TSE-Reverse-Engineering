package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ij implements ebd {
    private static final int[] k = {1, 4, 5, 3, 2, 0};
    public final Context a;
    public ih b;
    public final ArrayList c;
    public final ArrayList d;
    CharSequence e;
    Drawable f;
    View g;
    public im i;
    public boolean j;
    private final Resources l;
    private boolean m;
    private final boolean n;
    private final ArrayList o;
    private boolean p;
    private final ArrayList q;
    private boolean r;
    private int s = 0;
    public boolean h = false;
    private boolean t = false;
    private boolean u = false;
    private boolean v = false;
    private final ArrayList w = new ArrayList();
    private final CopyOnWriteArrayList x = new CopyOnWriteArrayList();
    private boolean y = false;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0073, code lost:
    
        if (r6.getBoolean(r1) != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x005d, code lost:
    
        if (r6 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005f, code lost:
    
        r0 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ij(android.content.Context r6) {
        /*
            r5 = this;
            r5.<init>()
            r0 = 0
            r5.s = r0
            r5.h = r0
            r5.t = r0
            r5.u = r0
            r5.v = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.w = r1
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r1.<init>()
            r5.x = r1
            r5.y = r0
            r5.a = r6
            android.content.res.Resources r1 = r6.getResources()
            r5.l = r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r5.c = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r5.o = r2
            r2 = 1
            r5.p = r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r5.d = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r5.q = r3
            r5.r = r2
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.keyboard
            if (r1 == r2) goto L76
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r6)
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r3 < r4) goto L61
            boolean r6 = defpackage.ij$$ExternalSyntheticApiModelOutline0.m(r1)
            if (r6 == 0) goto L76
        L5f:
            r0 = r2
            goto L76
        L61:
            android.content.res.Resources r6 = r6.getResources()
            java.lang.String r1 = "config_showMenuShortcutsWhenKeyboardPresent"
            java.lang.String r3 = "bool"
            int r1 = defpackage.edx.e(r6, r1, r3)
            if (r1 == 0) goto L76
            boolean r6 = r6.getBoolean(r1)
            if (r6 == 0) goto L76
            goto L5f
        L76:
            r5.n = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ij.<init>(android.content.Context):void");
    }

    private final void E(int i, boolean z) {
        if (i >= 0 && i < this.c.size()) {
            this.c.remove(i);
            if (z) {
                l(true);
            }
        }
    }

    public final boolean A(MenuItem menuItem, iv ivVar, int i) {
        boolean z;
        boolean z2;
        im imVar = (im) menuItem;
        if (imVar != null && imVar.isEnabled()) {
            boolean n = imVar.n();
            eco ecoVar = imVar.o;
            if (ecoVar != null && ecoVar.hasSubMenu()) {
                z = true;
            } else {
                z = false;
            }
            if (imVar.m()) {
                n |= imVar.expandActionView();
                if (n) {
                    i(true);
                    return true;
                }
            } else if (!imVar.hasSubMenu() && !z) {
                if ((i & 1) == 0) {
                    i(true);
                    return n;
                }
            } else {
                if ((i & 4) == 0) {
                    i(false);
                }
                if (!imVar.hasSubMenu()) {
                    imVar.l(new jc(this.a, this, imVar));
                }
                jc jcVar = imVar.k;
                if (z) {
                    ecoVar.onPrepareSubMenu(jcVar);
                }
                if (this.x.isEmpty()) {
                    z2 = false;
                } else {
                    if (ivVar != null) {
                        z2 = ivVar.f(jcVar);
                    } else {
                        z2 = false;
                    }
                    Iterator it = this.x.iterator();
                    while (it.hasNext()) {
                        WeakReference weakReference = (WeakReference) it.next();
                        iv ivVar2 = (iv) weakReference.get();
                        if (ivVar2 == null) {
                            this.x.remove(weakReference);
                        } else if (!z2) {
                            z2 = ivVar2.f(jcVar);
                        }
                    }
                }
                n |= z2;
                if (!n) {
                    i(true);
                }
            }
            return n;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void B() {
        this.r = true;
        l(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void C() {
        this.p = true;
        l(true);
    }

    public final void D() {
        this.s = 1;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return c(0, 0, 0, this.l.getString(i));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        Intent intent2;
        PackageManager packageManager = this.a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        if (queryIntentActivityOptions != null) {
            i5 = queryIntentActivityOptions.size();
        } else {
            i5 = 0;
        }
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < i5; i6++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i6);
            if (resolveInfo.specificIndex < 0) {
                intent2 = intent;
            } else {
                intent2 = intentArr[resolveInfo.specificIndex];
            }
            Intent intent3 = new Intent(intent2);
            intent3.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem c = c(i, i2, i3, resolveInfo.loadLabel(packageManager));
            c.setIcon(resolveInfo.loadIcon(packageManager));
            ((im) c).e = intent3;
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = c;
            }
        }
        return i5;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.l.getString(i));
    }

    final im b(int i, KeyEvent keyEvent) {
        char c;
        ArrayList arrayList = this.w;
        arrayList.clear();
        j(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (im) arrayList.get(0);
        }
        boolean x = x();
        for (int i2 = 0; i2 < size; i2++) {
            im imVar = (im) arrayList.get(i2);
            if (x) {
                c = imVar.h;
            } else {
                c = imVar.f;
            }
            if ((c == keyData.meta[0] && (metaState & 2) == 0) || ((c == keyData.meta[2] && (metaState & 2) != 0) || (x && c == '\b' && i == 67))) {
                return imVar;
            }
        }
        return null;
    }

    protected final MenuItem c(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = i3 >> 16;
        if (i5 >= 0 && i5 < 6) {
            int i6 = (k[i5] << 16) | ((char) i3);
            im imVar = new im(this, i, i2, i3, i6, charSequence, this.s);
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    if (((im) arrayList.get(size)).c <= i6) {
                        i4 = size + 1;
                        break;
                    }
                } else {
                    i4 = 0;
                    break;
                }
            }
            arrayList.add(i4, imVar);
            l(true);
            return imVar;
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    @Override // android.view.Menu
    public final void clear() {
        im imVar = this.i;
        if (imVar != null) {
            t(imVar);
        }
        this.c.clear();
        l(true);
    }

    public final void clearHeader() {
        this.f = null;
        this.e = null;
        this.g = null;
        l(false);
    }

    @Override // android.view.Menu
    public final void close() {
        i(true);
    }

    protected String d() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList e() {
        k();
        return this.q;
    }

    public final ArrayList f() {
        if (!this.p) {
            return this.o;
        }
        this.o.clear();
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            im imVar = (im) this.c.get(i);
            if (imVar.isVisible()) {
                this.o.add(imVar);
            }
        }
        this.p = false;
        this.r = true;
        return this.o;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            im imVar = (im) this.c.get(i2);
            if (imVar.a == i) {
                return imVar;
            }
            if (imVar.hasSubMenu() && (findItem = imVar.k.findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final void g(iv ivVar) {
        h(ivVar, this.a);
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.c.get(i);
    }

    public final void h(iv ivVar, Context context) {
        this.x.add(new WeakReference(ivVar));
        ivVar.b(context, this);
        this.r = true;
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.j) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (((im) this.c.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i(boolean z) {
        if (this.v) {
            return;
        }
        this.v = true;
        Iterator it = this.x.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            iv ivVar = (iv) weakReference.get();
            if (ivVar == null) {
                this.x.remove(weakReference);
            } else {
                ivVar.c(this, z);
            }
        }
        this.v = false;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        if (b(i, keyEvent) != null) {
            return true;
        }
        return false;
    }

    final void j(List list, int i, KeyEvent keyEvent) {
        char c;
        int i2;
        boolean x = x();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (!keyEvent.getKeyData(keyData)) {
            if (i == 67) {
                i = 67;
            } else {
                return;
            }
        }
        int size = this.c.size();
        for (int i3 = 0; i3 < size; i3++) {
            im imVar = (im) this.c.get(i3);
            if (imVar.hasSubMenu()) {
                imVar.k.j(list, i, keyEvent);
            }
            if (x) {
                c = imVar.h;
            } else {
                c = imVar.f;
            }
            if (x) {
                i2 = imVar.i;
            } else {
                i2 = imVar.g;
            }
            if ((modifiers & 69647) == (i2 & 69647) && c != 0 && ((c == keyData.meta[0] || c == keyData.meta[2] || (x && c == '\b' && i == 67)) && imVar.isEnabled())) {
                list.add(imVar);
            }
        }
    }

    public final void k() {
        ArrayList f = f();
        if (!this.r) {
            return;
        }
        Iterator it = this.x.iterator();
        boolean z = false;
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            iv ivVar = (iv) weakReference.get();
            if (ivVar == null) {
                this.x.remove(weakReference);
            } else {
                z |= ivVar.e();
            }
        }
        if (z) {
            this.d.clear();
            this.q.clear();
            int size = f.size();
            for (int i = 0; i < size; i++) {
                im imVar = (im) f.get(i);
                if (imVar.o()) {
                    this.d.add(imVar);
                } else {
                    this.q.add(imVar);
                }
            }
        } else {
            this.d.clear();
            this.q.clear();
            this.q.addAll(f());
        }
        this.r = false;
    }

    public final void l(boolean z) {
        if (!this.h) {
            if (z) {
                this.p = true;
                this.r = true;
            }
            if (!this.x.isEmpty()) {
                s();
                Iterator it = this.x.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    iv ivVar = (iv) weakReference.get();
                    if (ivVar == null) {
                        this.x.remove(weakReference);
                    } else {
                        ivVar.i();
                    }
                }
                r();
                return;
            }
            return;
        }
        this.t = true;
        if (z) {
            this.u = true;
        }
    }

    public final void m(iv ivVar) {
        Iterator it = this.x.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            iv ivVar2 = (iv) weakReference.get();
            if (ivVar2 == null || ivVar2 == ivVar) {
                this.x.remove(weakReference);
            }
        }
    }

    public final void n(Bundle bundle) {
        MenuItem findItem;
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(d());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((jc) item.getSubMenu()).n(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 > 0 && (findItem = findItem(i2)) != null) {
            findItem.expandActionView();
        }
    }

    public final void o(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((jc) item.getSubMenu()).o(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(d(), sparseArray);
        }
    }

    public void p(ih ihVar) {
        this.b = ihVar;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return z(findItem(i), i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        boolean z;
        im b = b(i, keyEvent);
        if (b != null) {
            z = z(b, i2);
        } else {
            z = false;
        }
        if ((i2 & 2) != 0) {
            i(true);
        }
        return z;
    }

    public final void q(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.g = view;
            this.e = null;
            this.f = null;
        } else {
            if (i > 0) {
                this.e = this.l.getText(i);
            } else if (charSequence != null) {
                this.e = charSequence;
            }
            if (i2 > 0) {
                this.f = this.a.getDrawable(i2);
            } else if (drawable != null) {
                this.f = drawable;
            }
            this.g = null;
        }
        l(false);
    }

    public final void r() {
        this.h = false;
        if (this.t) {
            this.t = false;
            l(this.u);
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                if (((im) this.c.get(i2)).b == i) {
                    break;
                } else {
                    i2++;
                }
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 >= 0) {
            int size2 = this.c.size() - i2;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= size2 || ((im) this.c.get(i2)).b != i) {
                    break;
                }
                E(i2, false);
                i3 = i4;
            }
            l(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                if (((im) this.c.get(i2)).a == i) {
                    break;
                } else {
                    i2++;
                }
            } else {
                i2 = -1;
                break;
            }
        }
        E(i2, true);
    }

    public final void s() {
        if (!this.h) {
            this.h = true;
            this.t = false;
            this.u = false;
        }
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            im imVar = (im) this.c.get(i2);
            if (imVar.b == i) {
                imVar.j(z2);
                imVar.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.y = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            im imVar = (im) this.c.get(i2);
            if (imVar.b == i) {
                imVar.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        int size = this.c.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            im imVar = (im) this.c.get(i2);
            if (imVar.b == i && imVar.s(z)) {
                z2 = true;
            }
        }
        if (z2) {
            l(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.m = z;
        l(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.c.size();
    }

    public boolean t(im imVar) {
        boolean z = false;
        if (!this.x.isEmpty() && this.i == imVar) {
            s();
            Iterator it = this.x.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                iv ivVar = (iv) weakReference.get();
                if (ivVar == null) {
                    this.x.remove(weakReference);
                } else {
                    z = ivVar.g(imVar);
                    if (z) {
                        break;
                    }
                }
            }
            r();
            if (z) {
                this.i = null;
            }
        }
        return z;
    }

    public boolean u(ij ijVar, MenuItem menuItem) {
        ih ihVar = this.b;
        if (ihVar != null && ihVar.K(ijVar, menuItem)) {
            return true;
        }
        return false;
    }

    public boolean v(im imVar) {
        boolean z = false;
        if (this.x.isEmpty()) {
            return false;
        }
        s();
        Iterator it = this.x.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            iv ivVar = (iv) weakReference.get();
            if (ivVar == null) {
                this.x.remove(weakReference);
            } else {
                z = ivVar.h(imVar);
                if (z) {
                    break;
                }
            }
        }
        r();
        if (z) {
            this.i = imVar;
        }
        return z;
    }

    public boolean w() {
        return this.y;
    }

    public boolean x() {
        return this.m;
    }

    public boolean y() {
        return this.n;
    }

    public final boolean z(MenuItem menuItem, int i) {
        return A(menuItem, null, i);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return c(i, i2, i3, this.l.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.l.getString(i4));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return c(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        im imVar = (im) c(i, i2, i3, charSequence);
        jc jcVar = new jc(this.a, this, imVar);
        imVar.l(jcVar);
        return jcVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return c(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public ij a() {
        return this;
    }
}
