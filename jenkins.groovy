library identifier: 'local-lib@master', retriever: legacySCM(scm);
import com.company.Sample;
node() {
  stage("x") {
    echo "ok"
  }
}
