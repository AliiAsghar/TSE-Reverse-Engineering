package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ghe implements oa {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ghe(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.oa
    public final void d(boolean z) {
        if (this.b == 0 || !z) {
            return;
        }
        ((qx) this.a).ac(null, 0);
    }

    @Override // defpackage.oa
    public final void e(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.b != 0) {
            ((qx) this.a).q.onTouchEvent(motionEvent);
            VelocityTracker velocityTracker = ((qx) this.a).o;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (((qx) this.a).i != -1) {
                int actionMasked = motionEvent.getActionMasked();
                int findPointerIndex = motionEvent.findPointerIndex(((qx) this.a).i);
                if (findPointerIndex >= 0) {
                    ((qx) this.a).X(actionMasked, motionEvent, findPointerIndex);
                }
                qx qxVar = (qx) this.a;
                oo ooVar = qxVar.b;
                if (ooVar != null) {
                    int i = 0;
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked != 3) {
                                if (actionMasked == 6) {
                                    int actionIndex = motionEvent.getActionIndex();
                                    int pointerId = motionEvent.getPointerId(actionIndex);
                                    qx qxVar2 = (qx) this.a;
                                    if (pointerId == qxVar2.i) {
                                        if (actionIndex == 0) {
                                            i = 1;
                                        }
                                        qxVar2.i = motionEvent.getPointerId(i);
                                        qx qxVar3 = (qx) this.a;
                                        qxVar3.ae(motionEvent, qxVar3.k, actionIndex);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            VelocityTracker velocityTracker2 = qxVar.o;
                            if (velocityTracker2 != null) {
                                velocityTracker2.clear();
                            }
                        } else {
                            if (findPointerIndex >= 0) {
                                qxVar.ae(motionEvent, qxVar.k, findPointerIndex);
                                ((qx) this.a).Z(ooVar);
                                qx qxVar4 = (qx) this.a;
                                qxVar4.m.removeCallbacks(qxVar4.n);
                                ((qx) this.a).n.run();
                                ((qx) this.a).m.invalidate();
                                return;
                            }
                            return;
                        }
                    }
                    ((qx) this.a).ac(null, 0);
                    ((qx) this.a).i = -1;
                }
            }
        }
    }

    @Override // defpackage.oa
    public final boolean k(RecyclerView recyclerView, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.b != 0) {
            ((qx) this.a).q.onTouchEvent(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            qv qvVar = null;
            if (actionMasked == 0) {
                ((qx) this.a).i = motionEvent.getPointerId(0);
                ((qx) this.a).c = motionEvent.getX();
                ((qx) this.a).d = motionEvent.getY();
                ((qx) this.a).aa();
                qx qxVar = (qx) this.a;
                if (qxVar.b == null) {
                    if (!qxVar.l.isEmpty()) {
                        View k = qxVar.k(motionEvent);
                        int size = qxVar.l.size() - 1;
                        while (true) {
                            if (size < 0) {
                                break;
                            }
                            qv qvVar2 = (qv) qxVar.l.get(size);
                            if (qvVar2.h.a == k) {
                                qvVar = qvVar2;
                                break;
                            }
                            size--;
                        }
                    }
                    if (qvVar != null) {
                        qx qxVar2 = (qx) this.a;
                        qxVar2.c -= qvVar.l;
                        qxVar2.d -= qvVar.m;
                        qxVar2.Y(qvVar.h, true);
                        if (((qx) this.a).a.remove(qvVar.h.a)) {
                            ((qx) this.a).j.l(qvVar.h);
                        }
                        ((qx) this.a).ac(qvVar.h, qvVar.i);
                        qx qxVar3 = (qx) this.a;
                        qxVar3.ae(motionEvent, qxVar3.k, 0);
                    }
                }
            } else if (actionMasked != 3 && actionMasked != 1) {
                int i = ((qx) this.a).i;
                if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                    ((qx) this.a).X(actionMasked, motionEvent, findPointerIndex);
                }
            } else {
                qx qxVar4 = (qx) this.a;
                qxVar4.i = -1;
                qxVar4.ac(null, 0);
            }
            VelocityTracker velocityTracker = ((qx) this.a).o;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (((qx) this.a).b == null) {
                return false;
            }
            return true;
        }
        if (motionEvent.getActionMasked() == 3) {
            ((kkc) this.a).l();
        }
        return false;
    }
}
