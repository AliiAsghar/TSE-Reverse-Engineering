package defpackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bdr {
    public final long a;
    public final long b;
    public final cti c;
    public final boolean d;
    public final bcy e;
    public final Comparator f;
    public final ud k = new ud((byte[]) null);
    public final List g = new ArrayList();
    public int h = -1;
    public int i = -1;
    public int j = -1;

    public bdr(long j, long j2, cti ctiVar, boolean z, bcy bcyVar, Comparator comparator) {
        this.a = j;
        this.b = j2;
        this.c = ctiVar;
        this.d = z;
        this.e = bcyVar;
        this.f = comparator;
    }

    public final int a(int i, bco bcoVar, bco bcoVar2) {
        if (i != -1) {
            return i;
        }
        bco a = bdt.a(bcoVar, bcoVar2);
        bco bcoVar3 = bco.a;
        int ordinal = a.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return -1;
                }
                throw new armm();
            }
            return this.j;
        }
        return this.j - 1;
    }
}
