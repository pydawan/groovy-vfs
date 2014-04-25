// ============================================================================
// (C) Copyright Schalk W. Cronje 2014
//
// This software is licensed under the Apache License 2.0
// See http://www.apache.org/licenses/LICENSE-2.0 for license details
//
// Unless required by applicable law or agreed to in writing, software distributed under the License is
// distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and limitations under the License.
//
// ============================================================================
package org.ysb33r.groovy.vfs.app

import groovy.transform.TupleConstructor
import org.ysb33r.groovy.dsl.vfs.VFS

@TupleConstructor
class Cat implements Cmd {

    boolean numberNonEmptyLines = false
    boolean showEndOfLines = false
    boolean numberLines = false
    boolean suppressRepeatedEmptyLines = false
    boolean showTabs = false
    boolean showNonPrinting = false
    List<org.ysb33r.groovy.dsl.vfs.URI> uris = []

    Integer run(VFS vfs) {
        Long lineCount=0
        vfs {
            uris.each {
                cat (it) {

                }
            }
        }
    }
}