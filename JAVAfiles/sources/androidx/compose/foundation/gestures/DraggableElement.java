package androidx.compose.foundation.gestures;

import defpackage.a;
import defpackage.ahj;
import defpackage.ahk;
import defpackage.ahp;
import defpackage.ajr;
import defpackage.arqr;
import defpackage.arqw;
import defpackage.arrp;
import defpackage.cga;
import defpackage.crc;
import defpackage.cyg;
import defpackage.d;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class DraggableElement extends cyg<ahj> {
    private static final arqr a = AnonymousClass1.a;
    private final ahk b;
    private final ahp c;
    private final boolean d;
    private final ajr f;
    private final boolean g;
    private final arqw h;
    private final arqw i;
    private final boolean j;

    /* compiled from: PG */
    /* renamed from: androidx.compose.foundation.gestures.DraggableElement$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<crc, Boolean> {
        public static final AnonymousClass1 a = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            return true;
        }
    }

    public DraggableElement(ahk ahkVar, ahp ahpVar, boolean z, ajr ajrVar, boolean z2, arqw arqwVar, arqw arqwVar2, boolean z3) {
        this.b = ahkVar;
        this.c = ahpVar;
        this.d = z;
        this.f = ajrVar;
        this.g = z2;
        this.h = arqwVar;
        this.i = arqwVar2;
        this.j = z3;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new ahj(this.b, a, this.c, this.d, this.f, this.g, this.h, this.i, this.j);
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        boolean z;
        boolean z2;
        ahj ahjVar = (ahj) cVar;
        arqr arqrVar = a;
        ahk ahkVar = ahjVar.f;
        ahk ahkVar2 = this.b;
        if (!d.F(ahkVar, ahkVar2)) {
            ahjVar.f = ahkVar2;
            z = true;
        } else {
            z = false;
        }
        ahp ahpVar = this.c;
        if (ahjVar.g != ahpVar) {
            ahjVar.g = ahpVar;
            z = true;
        }
        boolean z3 = this.j;
        if (ahjVar.k != z3) {
            ahjVar.k = z3;
            z2 = true;
        } else {
            z2 = z;
        }
        arqw arqwVar = this.i;
        arqw arqwVar2 = this.h;
        boolean z4 = this.g;
        ajr ajrVar = this.f;
        boolean z5 = this.d;
        ahjVar.i = arqwVar2;
        ahjVar.j = arqwVar;
        ahjVar.h = z4;
        ahjVar.y(arqrVar, z5, ajrVar, ahpVar, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DraggableElement draggableElement = (DraggableElement) obj;
        if (d.F(this.b, draggableElement.b) && this.c == draggableElement.c && this.d == draggableElement.d && d.F(this.f, draggableElement.f) && this.g == draggableElement.g && d.F(this.h, draggableElement.h) && d.F(this.i, draggableElement.i) && this.j == draggableElement.j) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.b.hashCode() * 31) + this.c.hashCode();
        ajr ajrVar = this.f;
        if (ajrVar != null) {
            i = ajrVar.hashCode();
        } else {
            i = 0;
        }
        return (((((((((((hashCode * 31) + a.v(this.d)) * 31) + i) * 31) + a.v(this.g)) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + a.v(this.j);
    }
}
