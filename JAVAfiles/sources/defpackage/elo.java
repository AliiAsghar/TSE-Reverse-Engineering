package defpackage;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class elo extends dys {
    public final TextView b;
    public boolean c = true;
    private final elm d;

    public elo(TextView textView) {
        this.b = textView;
        this.d = new elm(textView);
    }

    public final TransformationMethod g(TransformationMethod transformationMethod) {
        if (this.c) {
            if (!(transformationMethod instanceof els) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                return new els(transformationMethod);
            }
            return transformationMethod;
        }
        if (transformationMethod instanceof els) {
            return ((els) transformationMethod).a;
        }
        return transformationMethod;
    }

    public final void h() {
        this.b.setTransformationMethod(g(this.b.getTransformationMethod()));
    }

    public final InputFilter[] i(InputFilter[] inputFilterArr) {
        InputFilter[] inputFilterArr2;
        int length;
        if (!this.c) {
            SparseArray sparseArray = new SparseArray(1);
            int i = 0;
            while (true) {
                length = inputFilterArr.length;
                if (i >= length) {
                    break;
                }
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof elm) {
                    sparseArray.put(i, inputFilter);
                }
                i++;
            }
            if (sparseArray.size() != 0) {
                inputFilterArr2 = new InputFilter[length - sparseArray.size()];
                int i2 = 0;
                for (int i3 = 0; i3 < length; i3++) {
                    if (sparseArray.indexOfKey(i3) < 0) {
                        inputFilterArr2[i2] = inputFilterArr[i3];
                        i2++;
                    }
                }
            } else {
                return inputFilterArr;
            }
        } else {
            int length2 = inputFilterArr.length;
            for (InputFilter inputFilter2 : inputFilterArr) {
                if (inputFilter2 == this.d) {
                    return inputFilterArr;
                }
            }
            inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length2);
            inputFilterArr2[length2] = this.d;
        }
        return inputFilterArr2;
    }
}
