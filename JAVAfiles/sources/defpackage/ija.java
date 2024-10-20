package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.view.TouchDelegate;
import android.view.View;
import com.google.android.apps.messaging.conversation.badges.BadgesRecyclerView;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ija {
    public final BadgesRecyclerView a;
    private final Map b;
    private final aksr c;
    private final iiu d;
    private ArrayList e;
    private iiz f;
    private boolean g = false;
    private final wfh h;

    public ija(BadgesRecyclerView badgesRecyclerView, Map map, aksr aksrVar, iiu iiuVar, wfh wfhVar) {
        this.a = badgesRecyclerView;
        this.b = map;
        this.c = aksrVar;
        this.d = iiuVar;
        this.h = wfhVar;
    }

    public final void a(alog alogVar, alor alorVar) {
        Optional empty;
        this.a.getContext();
        View view = (View) this.a.getParent();
        if (!this.g) {
            this.f = new iiz(this.b, this.c, alorVar);
            this.a.aj(new LinearLayoutManager(0));
            this.a.aJ(this.d);
            this.a.ag(this.f);
            this.g = true;
        }
        iiz iizVar = this.f;
        alog alogVar2 = iizVar.c;
        if (alogVar2 != null && alogVar != null && !alogVar2.isEmpty() && !alogVar.isEmpty()) {
            if (alogVar2.size() <= alogVar.size() + 1 && alogVar2.size() >= alogVar.size() - 1) {
                if (alogVar2.size() == alogVar.size() - 1) {
                    int i = 0;
                    boolean z = false;
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        if (i < alogVar2.size()) {
                            if (!((iip) alogVar2.get(i)).equals(alogVar.get(i + i2))) {
                                if (z) {
                                    empty = Optional.empty();
                                    break;
                                }
                                i2++;
                                i3 = i;
                                i--;
                                z = true;
                            }
                            i++;
                        } else {
                            if (!z) {
                                i3 = alogVar2.size();
                            }
                            empty = Optional.of(new iiv(2, i3));
                        }
                    }
                } else if (alogVar2.size() == alogVar.size() + 1) {
                    int i4 = 0;
                    boolean z2 = false;
                    int i5 = 0;
                    int i6 = 0;
                    while (true) {
                        if (i4 < alogVar2.size()) {
                            if (i4 == alogVar.size()) {
                                if (!z2) {
                                    break;
                                } else {
                                    z2 = true;
                                }
                            }
                            if (!((iip) alogVar2.get(i4)).equals(alogVar.get(i4 + i5))) {
                                if (z2) {
                                    empty = Optional.empty();
                                    break;
                                } else {
                                    i5--;
                                    z2 = true;
                                    i6 = i4;
                                }
                            }
                            i4++;
                        } else {
                            i4 = i6;
                            break;
                        }
                    }
                    empty = Optional.of(new iiv(4, i4));
                } else {
                    int i7 = 0;
                    int i8 = -1;
                    while (true) {
                        if (i7 < alogVar2.size()) {
                            if (!((iip) alogVar2.get(i7)).equals(alogVar.get(i7))) {
                                if (i8 != -1) {
                                    empty = Optional.empty();
                                    break;
                                }
                                i8 = i7;
                            }
                            i7++;
                        } else if (i8 == -1) {
                            empty = Optional.of(new iiv(1, -1));
                        } else {
                            empty = Optional.of(new iiv(3, i8));
                        }
                    }
                }
            } else {
                empty = Optional.empty();
            }
        } else {
            empty = Optional.empty();
        }
        iizVar.c = alogVar;
        if (empty.isPresent()) {
            int i9 = ((iiv) empty.get()).b - 1;
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 == 3) {
                        iizVar.y(((iiv) empty.get()).a);
                    }
                } else {
                    iizVar.q(((iiv) empty.get()).a);
                }
            } else {
                iizVar.u(((iiv) empty.get()).a, 2);
            }
        } else {
            iizVar.p();
        }
        if (alogVar.isEmpty()) {
            view.setTouchDelegate(null);
            this.a.setVisibility(8);
        } else {
            this.e = new ArrayList();
            aabr.am(this.a, new gtq(this, 11));
            this.a.aL(new iiw(this));
            this.a.setVisibility(0);
        }
    }

    public final void b() {
        View view;
        View view2;
        TouchDelegate touchDelegate;
        aefj aefjVar;
        View view3 = (View) this.a.getParent();
        if (view3 != null) {
            aefj aefjVar2 = (aefj) view3.getTouchDelegate();
            int i = 0;
            if (aefjVar2 != null) {
                for (int i2 = 0; i2 < this.e.size(); i2++) {
                    aefjVar2.a.remove((View) this.e.get(i2));
                }
            }
            this.e.clear();
            int childCount = this.a.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                this.e.add(this.a.getChildAt(i3));
            }
            while (i < childCount) {
                View view4 = (View) this.e.get(i);
                if (i > 0) {
                    view = (View) this.e.get(i - 1);
                } else {
                    view = null;
                }
                i++;
                if (i < childCount) {
                    view2 = (View) this.e.get(i);
                } else {
                    view2 = null;
                }
                if (this.h.A()) {
                    touchDelegate = new TouchDelegate(hwr.u(this.a, view4, view2, view), view4);
                } else {
                    touchDelegate = new TouchDelegate(hwr.u(this.a, view4, view, view2), view4);
                }
                view4.getClass();
                TouchDelegate touchDelegate2 = view3.getTouchDelegate();
                if (touchDelegate2 instanceof aefj) {
                    aefjVar = (aefj) touchDelegate2;
                } else {
                    aefjVar = new aefj(view3, touchDelegate2);
                }
                albo.T(true);
                aefjVar.a.put(view4, touchDelegate);
                if (touchDelegate == aefjVar.b) {
                    aefjVar.b = null;
                }
                if (touchDelegate2 != aefjVar) {
                    view3.setTouchDelegate(aefjVar);
                }
            }
        }
    }
}
