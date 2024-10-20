package defpackage;

import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class agmb {
    public boolean aA;
    public BitSet ax;
    public Map ay;
    public final int az;

    /* JADX INFO: Access modifiers changed from: protected */
    public agmb(agcp agcpVar) {
        this.az = agcpVar.c();
    }

    public final Map aA() {
        Map map = this.ay;
        if (map == null) {
            return null;
        }
        return new HashMap(map);
    }

    public final void aB() {
        this.aA = true;
    }

    public final void aC(int i) {
        BitSet bitSet = this.ax;
        if (bitSet != null) {
            bitSet.set(i);
        }
    }

    public final void aD() {
        this.ax = new BitSet();
    }

    public final BitSet az() {
        BitSet bitSet = this.ax;
        if (bitSet == null) {
            return null;
        }
        return (BitSet) bitSet.clone();
    }
}
